package iniciante;

import java.util.Scanner;

public class SwapTwoVariables {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numberOne = sc.nextInt();
        System.out.println("Digite outro número: ");
        int numberTwo = sc.nextInt();
        System.out.printf("Antes: %d e %d ",numberOne,numberTwo);
        numberOne = numberOne + numberTwo;
        numberTwo = numberOne - numberTwo;
        numberOne = numberOne - numberTwo;

        System.out.printf("Depois: %d e %d",numberOne,numberTwo);


    }
}
