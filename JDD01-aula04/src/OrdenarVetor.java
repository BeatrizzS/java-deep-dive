import java.util.Arrays;

public class OrdenarVetor {
    public static void main(String[] args) {
        String[] nomes = {"Maria", "João", "Pedro", "Ana", "Carolina", "Daniela", "Lucia"};

        System.out.println("Exibindo vetor original: ");
        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        Arrays.sort(nomes);
        System.out.println("Exibindo vetor ordenado: ");
        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
