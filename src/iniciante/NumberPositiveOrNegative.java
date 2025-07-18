package iniciante;

import java.util.Scanner;

public class NumberPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número (Negativo/Positivo)");
        int number = sc.nextInt();
        if (number < 0 ){
            System.out.println("Número Negativo");
        } else if (number > 0) {
            System.out.println("Número Positivo");
        }else {
            System.out.println("Número Neutro");
        }
    }
}
