import java.util.Scanner;

public class Ong {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double investimento, doacao;

        System.out.println("Digite o valor da sua doação: ");
        doacao = leitor.nextDouble();

        if (doacao >= 1000.00) {
            investimento = doacao * 0.1;
        } else {
            investimento = doacao * 0.05;
        }
        System.out.println("O investimento será de: R$" + investimento);
    }
}
