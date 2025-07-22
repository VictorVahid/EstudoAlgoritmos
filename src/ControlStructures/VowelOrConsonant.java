package ControlStructures;

import java.util.Objects;
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letter = sc.nextLine();


        if (Objects.equals(letter, "a") || Objects.equals(letter, "e") || Objects.equals(letter, "i") || Objects.equals(letter, "o") || Objects.equals(letter, "u")) {
            System.out.printf("%s é Vogal", letter);
        } else {
            System.out.printf("%s é Consoante", letter);
        }
        sc.close();
    }
}
