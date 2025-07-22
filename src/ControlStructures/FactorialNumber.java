package ControlStructures;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = sc.nextInt();
        int numberEnter = number;
        int factorial = 0;
        for (int i = number - 1; i>= 1; i--){
            factorial = number * i;
            number = factorial;
        }
        System.out.printf("Fatorial de !%d é: %d",numberEnter,factorial);
    }
}
