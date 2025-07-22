package ControlStructures;

import java.util.Scanner;

public class CountBetween {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numberOne = sc.nextInt();
        System.out.println("Digite um segundo número: ");
        int numberTwo = sc.nextInt();
        int CounterOdd = 0;
        for (int i = numberOne;i <= numberTwo; i++){
            if (i % 2 == 0){
                CounterOdd += 1;
            }
        }
        System.out.println(CounterOdd);
        sc.close();
    }
}
