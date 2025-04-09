public class While {
    public static void main(String[] args) {

        //mostrando todos os numeros pares de 0 até 20
        int i = 0;
        System.out.println("Par");
        while (i <= 20){
            System.out.println(i);
            i += 2;
        }

        System.out.println("Impar");
        i =1;
        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }
        i = 20;
        while (i >= 0){
            System.out.println(i);
            i -= 2;
        }
    }
}
