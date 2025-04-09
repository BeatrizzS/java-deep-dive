import java.util.Scanner;

public class MediaIdadesDoWhile {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int idade = 0, media, numeroAluno;
        //inicializando a variavel
        numeroAluno = 1;
        do {
            System.out.println("Digite a idade do " + numeroAluno + "º aluno: ");
            //incremento - alterar a variavel idade
            idade = idade + leitor.nextInt();
        }while (numeroAluno <= 5);{
                //a condição se torne falta
                numeroAluno++;
            }

            media = idade / 5;
            System.out.println("A média de idade dos alunos da escola é: " + media);


    }
}
