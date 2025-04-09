import java.util.Scanner;

public class Rodizio {
    public static void main(String[] args) {
        //yhe-9876
        //9876 - Rodizio é na Quarta-feira
        //1 e 2: segunda / 3 e 4: terça / 5 e 6: quarta / 7 e 8: quinta / 9 e 0: sexta

        int placa = 9872;
        //todo numero dividido por 10 vai ter como resto o ultimo digito
        int digito = placa % 10;

        switch (digito){
            case 1:
            case 2:
                System.out.println("Não pode rodar de segunda-feira");break;
            case 3:
            case 4:
                System.out.println("Não pode rodar de terça-feira");break;
            case 5:
            case 6:
                System.out.println("Não pode rodar de quarta-feira");break;
            case 7:
            case 8:
                System.out.println("Não pode rodar de quinta-feira");break;
            case 9:
            case 0:
                System.out.println("Não pode rodar de sexta-feira");break;
        }
    }
}
