package ControlStructures;

import java.util.Scanner;

public class DivisorsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
