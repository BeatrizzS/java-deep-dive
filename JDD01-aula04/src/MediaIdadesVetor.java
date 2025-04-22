import java.util.Scanner;

public class MediaIdadesVetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // variavel => tipo nome;
        int i;
        //vetor armazena um conjunto finito de elementos
        int[] numeros = new int[5];
        String[] nomes = {"Ana", "Eliane", "Andre", "Maria"};
        numeros[0] = 4;
        int soma = 0;
        System.out.println(numeros);
        for (i=0; i < 5; i++){
            System.out.println("Digite a idade do " + (i+1) + " aluno: ");
            numeros[i] = leitor.nextInt();
            soma += numeros[i];
        }
        int media = soma / numeros.length;
        System.out.println("Média de idades: " + media);
        for (i = 0; i < 5; i++) {
            System.out.println("Idade do " + (i+1) + " aluno: " + numeros[i]);
        }
    }
}
