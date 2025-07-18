package Beginner;

import java.util.Scanner;

public class GreaterOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numberOne = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int numberTwo = sc.nextInt();
        System.out.printf("O número %d é maior", Math.max(numberOne, numberTwo));
    }
}
