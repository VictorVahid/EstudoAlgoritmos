package Beginner;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        int ano = sc.nextInt();

        if (ano % 4 == 0){
            System.out.printf("%d é bissexto", ano);
        }else if (ano % 100 == 0){
            if(ano % 400 == 0){
                System.out.printf("%d é bissexto", ano);
            }
        }else {
            System.out.printf("%d não é bissexto", ano);
        }
    }
}
