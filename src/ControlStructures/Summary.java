package ControlStructures;

import java.util.Scanner;

public class Summary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = sc.nextInt();
        int soma = 0;
        for (int i = 1; i <= number; i++) {
            soma += i;
        }
        System.out.println(soma);
        sc.close();
    }
}
