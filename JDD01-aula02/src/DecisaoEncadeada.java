import java.util.Scanner;

public class DecisaoEncadeada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade;
        System.out.println("Entre com a sua idade: ");
        idade = leitor.nextInt();

        if (idade < 16){
            System.out.println("Não pode votar");
        } else if (idade < 18){
            System.out.println("Voto opcional!");
        } else{
            System.out.println("Voto obrigatório!");
        }

        //if(idade >= 18){
        //    System.out.println("Obrigatório votar!");
        //} else if (idade >= 16) {
        //    System.out.println("Voto opcional!");
        //} else {
        //    System.out.println("Não pode votar!");
        //}
    }
}
