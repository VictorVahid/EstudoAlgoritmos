package Beginner;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = sc.nextInt();
        if (number%2 == 0){
            System.out.printf("%d é Par",number);
        }else{
            System.out.printf("%d é Impar",number);
        }

    }
}
