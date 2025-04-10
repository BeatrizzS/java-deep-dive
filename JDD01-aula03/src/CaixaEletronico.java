import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double saldo = 0, valor;
        int opcao;

        System.out.println("Bem vindo ao Banco FIAP!");
        do {
            System.out.println("\nOperações disponíveis neste caixa:" +
                    "\n\n1 - Deposito\t\t2 - Saque" +
                    "\n\n3 - Consultar Saldo\t\t4 - Sair");
            System.out.println("Opção: ");
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("Digite o valor a depositar: ");
                    valor = leitor.nextDouble();
                    saldo += valor;
                    break;
                case 2:
                    System.out.println("Digite o valor a sacar: ");
                    valor = leitor.nextDouble();
                    if (saldo >= valor)
                        saldo -= valor;
                    break;
                case 3:
                    System.out.println("Seu saldo é de: " + saldo);
                    break;
                case 4:
                    System.out.println("Obrigada por usar o nosso Banco!");
                    break;
                default:
            }
        } while (opcao != 4);
    }
}