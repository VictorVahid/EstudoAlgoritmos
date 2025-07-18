package Beginner;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1- Convert Celsius to Fahrenheit ");
        System.out.println("2- Convert Fahrenheit to Celsius ");
        int choice = sc.nextInt();
        if (choice == 1){
            //F = (C * 9/5) + 32
            System.out.println("Enter a temperature in Celsius: ");
            float temperature = sc.nextFloat();
            float Fahrenheit = (temperature * ((float) 9 /5)) +32;
            System.out.printf("Celsius %.2f",temperature);
            System.out.printf("Fahrenheit %.2f",Fahrenheit);
        } else if (choice == 2) {
            //C = (F - 32) * 5/9.
            System.out.println("Enter a temperature in Fahrenheit : ");
            float temperature = sc.nextFloat();
            float Celsius = (temperature - 32) * 5/9;
            System.out.printf("Fahrenheit %.2f",temperature);
            System.out.printf("Celsius %.2f",Celsius);
        }else {
            System.out.println("Enter Invalid");
        }
    }
}
