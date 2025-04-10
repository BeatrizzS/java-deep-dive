public class ExemplosFor {
    public static void main(String[] args) {

        //mostrando todos os numeros pares de 0 até 20
        System.out.println("Par");
        for (int i = 0; i <= 20; i += 20)
            System.out.println(i);
//mostrando todos os numeros impares de 0 a 20
        System.out.println("Impar");
        for (int i = 1; i <= 20; i += 20)
            System.out.println(i);
        //mostrando os numeros pares de 20 a 0
        System.out.println("20 a 0 todos os numeros pares de 20 a 0");
        for (int i = 20; i >= 0; i-=20)
            System.out.println(i);

    }
}

