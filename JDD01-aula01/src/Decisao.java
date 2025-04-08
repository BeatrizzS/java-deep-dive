import java.util.Scanner;

public class Decisao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();
        if(idade >= 18){ //se verdadeiro
            System.out.println("Maior de idade.");
        } else { //se falso
            System.out.println("Menor de idade.");
        }
        System.out.println("Fim do programa.");
    }
}
