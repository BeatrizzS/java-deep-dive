import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        double real = 5.91;
        double dolar;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor da sua doação em Dolar: ");
        dolar = leitor.nextDouble();

        System.out.println("Você está doando $" + dolar + ". Convertendo para REAL, você está " +
                "doando R$" + dolar * real);

    }

}
