import java.util.Scanner;

public class DecisaoOperadorLogico {
    public static void main(String[] args) {
        //usuario: admin
        //senha: admin123
        Scanner leitor = new Scanner(System.in);
        String usuario, senha;
        System.out.println("Digite seu usuário: ");
        usuario = leitor.nextLine();
        System.out.println("Digite sua senha: ");
        senha = leitor.nextLine();


        //no caso de uma String, por ser um objeto, precisamos usar o equals
        if (usuario.equalsIgnoreCase("admin") && senha.equals("admin123")){
            System.out.println("Bem vindo ao sistema!");
        } else{
            System.out.println("Usuário e/ou senha inválidos!");
        }

    }
}
