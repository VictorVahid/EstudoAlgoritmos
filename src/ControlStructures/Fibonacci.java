package ControlStructures;

public class Fibonacci {
    public static void main(String[] args) {

        int numberOne = 0;
        int numberTwo = 1;
        int numberThree;
        int counter = 30;
        while (numberOne <counter) {
            numberThree = numberOne+numberTwo;
            numberOne = numberTwo;
            numberTwo = numberThree;
            System.out.println(numberThree);
        }
    }
}
