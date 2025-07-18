package Beginner;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 para Soma");
        System.out.println("Digite 2 para Subtração");
        System.out.println("Digite 3 para Multiplicação");
        System.out.println("Digite 4 para Divisão");

        int enter = sc.nextInt();

        if (enter == 1){
            System.out.println("Digite um número: ");
            int number = sc.nextInt();
            int i;
            for (i = 0; i<= 10; i++){
                System.out.printf("%d + %d = %d\n",number,i,number+i);
            }
        } else if (enter == 2) {
            System.out.println("Digite um número: ");
            int number = sc.nextInt();
            int i;
            for (i = 0; i<= 10; i++){
                System.out.printf("%d - %d = %d\n",number,i,number-i);
            }
        } else if (enter == 3) {
            System.out.println("Digite um número: ");
            int number = sc.nextInt();
            int i;
            for (i = 0; i<= 10; i++){
                System.out.printf("%d * %d = %d\n",number,i,number*i);
            }
        }else if (enter == 4){
            System.out.println("Digite um número: ");
            int number = sc.nextInt();
            int i;
            System.out.printf("%d / 0 = 0\n",number);
            for (i = 1; i<= 10; i++){
                System.out.printf("%d / %d = %d\n",number,i,number/i);
            }
        }else{
            System.out.println("Entrada Inválida");
        }
    }
}
