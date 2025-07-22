package ControlStructures;

import java.util.Scanner;

public class PrimeNumber_Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = sc.nextInt();
        boolean isNotPrime = false;
        if (number <= 1) {
            isNotPrime = true;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isNotPrime = true;
                    break;
                }
            }
        }
        System.out.printf("%d é primo?: %b\n", number, !isNotPrime);
        sc.close();
    }
}

