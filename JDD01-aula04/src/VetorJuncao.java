import java.util.Scanner;

public class VetorJuncao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        /*Ler vetor A e o vetor B com 4 elementos cada
        * Criar o vetor C que vai a junção dos vetores A e B*/
        int[] vetA = new int[4];
        int[] vetB = new int[4];
        int[] vetC = new int[8];
        int i;
        System.out.println("Preenche o vetor A");
        for (i = 0; i<4; i++){
            System.out.println("Digite um numero: ");
            vetA[i] = leitor.nextInt();
        }
        System.out.println("\nPreenche o vetor B");
        for (i = 0; i<4; i++){
            System.out.println("Digite um numero: ");
            vetB[i] = leitor.nextInt();
        }

        for (i=0; i<4; i++){
            vetC[i] = vetA[i];
            vetC[i+4] = vetB[i];
        }

        for (i=0; i<8; i++){
            System.out.println(vetC[i]);
        }
    }
}
