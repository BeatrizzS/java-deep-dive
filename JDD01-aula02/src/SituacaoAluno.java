import java.util.Scanner;

public class SituacaoAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        //Aprovado >=7
        //Em prova final >=4
        //Reprovado <4
        System.out.println("Informe a primeira nota do aluno: ");
        nota1 = leitor.nextDouble();
        System.out.println("Informe a segunda nota do aluno: ");
        nota2 = leitor.nextDouble();
        System.out.println("Informe a terceira nota do aluno: ");
        nota3 = leitor.nextDouble();

        media = (nota1 + nota2 + nota3)/3;
        //System.out.println("Sua média é: " + media);

/*        if (media >= 7) {
            System.out.println("Aprovado!");
            System.out.println("Média: " + media);

        } else if (media >= 4){
            System.out.println("Em prova final!");
            System.out.println("Média: " + media);
        } else {
            System.out.println("Reprovado!");
            System.out.println("Média: " + media);
        } */
        //outra forma de resolver:
        //nova condicao abaixo
        //em recuperação o aluno deverá calcular nova media >= 6 aprovado, reprovado

        String situacao;
        if (media >= 7) {
            situacao = "Aprovado!";
        }else if (media >= 4){
            situacao = "Prova Final!";
            System.out.println("Informe a nota do exame: ");
            double exame = leitor.nextDouble();
            double novaMedia = (media + exame) / 2;
            if(novaMedia >= 6){
                situacao = "Aluno aprovado após o exame!";
                media = novaMedia;
            }else{
                situacao = "Aluno reprovado após exame!";
                media = novaMedia;
            }
        } else {
            situacao = "Reprovado!";
        }
        System.out.println("Situação final do aluno: " + situacao + " Média: " + media);

    }
}
