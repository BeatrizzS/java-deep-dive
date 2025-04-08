import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String nome;
        int idade;
        Integer idade2;
        int n1 = 5, n2 = 2;
        int soma = n1 + n2;
        double n3 = 5.0;
        System.out.println("Soma = " + soma);
        int subtracao = n1 - n2;
        System.out.println(subtracao);
        double divisao = n3 / n2;
        System.out.println(n1 + " / " + n2 + " = " + divisao);
        int resto = n1 % n2;
        System.out.println("Resto: " + resto);


        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        nome = leitor.nextLine();
        System.out.println(nome + ", agora digite a sua idade: ");
        idade = leitor.nextInt();
        System.out.println("Bem vindo(a), " + nome + ". A sua idade é: " + idade);
    }
}
