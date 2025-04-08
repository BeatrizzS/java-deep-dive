import java.util.Scanner;

public class TrocaValores {
    public static void main(String[] args) {
        int a, b, aux;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        a = leitor.nextInt();
        System.out.println("Agora digite o segundo valor: ");
        b = leitor.nextInt();

        aux = a;
        a = b;
        b = aux;

        System.out.println("A: " + a + " B: " + b);
    }
}
