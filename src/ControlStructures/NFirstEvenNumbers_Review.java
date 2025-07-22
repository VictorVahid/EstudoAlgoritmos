package ControlStructures;

import java.util.Scanner;

public class NFirstEvenNumbers_Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            int numeroPar = i * 2;
            System.out.println(numeroPar);
        }
        sc.close();
    }
}