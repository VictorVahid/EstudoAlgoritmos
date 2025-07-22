package ControlStructures;

import java.util.Scanner;

public class NumberAMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um número: ");
        int number = sc.nextInt();

        if (number % 3 == 0 & number % 5 == 0){
            System.out.printf("%d é múltiplo de 3 e 5 ao mesmo tempo", number);
        }else {
            System.out.printf("%d não é múltiplo de 3 e 5 ao mesmo tempo", number);
        }
        sc.close();
    }
}
