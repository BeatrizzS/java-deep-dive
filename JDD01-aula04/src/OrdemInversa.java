import java.util.Arrays;
import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        /*Leia um vetor A com 5 elementos
        * Criar um vetor B com a mesma dimensão, composto por os elementos
        * do vetor A em ordem inversa*/
        int[] vetA = new int[6];
        int[] vetB = new int[6];
        int[] vetC = new int[6];
        int i;
        for (i = 0; i<5; i++){
        System.out.println("Digite o " + (i+1) + " valor: ");
        vetA[i] = leitor.nextInt();
        }
        int x = vetA.length -1;
        for (i = 0; i < vetA.length; i++)
        {
            //preenche o vetor B do início para o fim
            vetB[i] = vetA[x];
            x--;
            //preenche o vetor C do fim para o inicio
            vetC[5 - i] = vetA[i];
        }
        for (i = 0; i < vetA.length; i++) {
            System.out.println("Vetor A: " + vetA[i] +
                    "\tVetor B: " + vetB[i]);
            }
        }
}
