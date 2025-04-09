import java.util.Scanner;

public class DecisaoIfCompleto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Solicitar 2 notas de um aluno (Entrada de dado)
        // calcular a media (PD)
        //Apresentar uma mensagem se ele está aprovado ou reprovado (Saída de dado)
        //Para o aluno ser aprovado a média deverá ser maior ou igual a 6

        double nota1, nota2, media;
        System.out.println("Informe a primeira nota do aluno: ");
        nota1 = leitor.nextDouble();
        System.out.println("Informe a segunda nota do aluno: ");
        nota2 = leitor.nextDouble();

        media = (nota1 + nota2)/2;
        //System.out.println("Sua média é: " + media);

        if (media >= 6) {
            System.out.println("Aprovado!");
            System.out.println("Média: " + media);

        } else {
            System.out.println("Reprovado!");
            System.out.println("Média: " + media);
        }
    }

}
