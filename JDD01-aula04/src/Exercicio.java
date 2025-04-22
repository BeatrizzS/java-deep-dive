import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        /*Exercício 1: Preencha um vetor com 10 números.
    Exercício 1: Preencha um vetor com 10 números.
    a) Exiba o maior valor.
    b) Some os elementos do vetor.
    c) Exiba a média dos elementos inseridos.
    d) Exiba o índice do primeiro positivo inserido.
    e) Exiba o índice do último negativo.
         * */
        Scanner leitor = new Scanner(System.in);
        int[] vetNum = new int[10];
        int i, maiorValor = 0, soma = 0;
        //Leitura o vetor
        //for(inicialização; condição; inc/dec)
        for(i=0; i < vetNum.length; i++){
            System.out.println("Digite o " + (i+1) + "º número: ");
            vetNum[i] = leitor.nextInt();
        }
        for(i=0; i < vetNum.length; i++){
            //Maior valor
            if (vetNum[i] > maiorValor){
                maiorValor = vetNum[i];
            }
            //Some os elementos do vetor.
            soma += vetNum[i];
        }
        System.out.println("O maior valor do vetor é: " +
                maiorValor);
        System.out.println("Soma dos elementos do vetor: " +
                soma);
        int media = soma/vetNum.length;
        System.out.println("Média dos elementos do vetor é: "
                + media );
        // Exiba o índice do primeiro positivo inserido.
        for(i=0; i < vetNum.length; i++){
            if(vetNum[i]>0)
                System.out.println("Indice do primeiro positivo é " + i);
            break;
        }
        int indiceNegativo = -1;
        // Exiba o índice do último negativo.
        for(i=0; i < vetNum.length; i++){
            if(vetNum[i]<0){
                indiceNegativo = i;
            }
        }
        if(indiceNegativo == -1)
            System.out.println("Não existem elementos negativos no vetor");
        else
            System.out.println("O indice do último elemento negativo do vetor é: " + indiceNegativo);
    }
}
