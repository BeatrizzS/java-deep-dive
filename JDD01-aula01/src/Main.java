import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a, b, x;
        System.out.println("Entre com o primeiro valor: ");
        a = leitor.nextInt();

        System.out.println("Entre com o segundor valor: ");
        b = leitor.nextInt();
        x = a + b;

        System.out.println("X = " + x);
    }
}
