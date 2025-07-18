package iniciante;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para soma: ");
        System.out.println("Digite 2 para subtração: ");
        System.out.println("Digite 3 para multiplicação: ");
        System.out.println("Digite 4 para divisão: ");
        int operation = sc.nextInt();
        if (operation == 1){
            System.out.println("Digite um número: ");
            int x = sc.nextInt();
            System.out.println("Digite um segundo número: ");
            int y = sc.nextInt();
            int resultant = x+y;
            System.out.printf("%d + %d: %d ",x,y,resultant);
        } else if (operation == 2) {
            System.out.println("Digite um número: ");
            int x = sc.nextInt();
            System.out.println("Digite um segundo número: ");
            int y = sc.nextInt();
            int resultant = x-y;
            System.out.printf("%d - %d: %d ",x,y,resultant);
        } else if (operation == 3) {
            System.out.println("Digite um número: ");
            int x = sc.nextInt();
            System.out.println("Digite um segundo número: ");
            int y = sc.nextInt();
            int resultant = x*y;
            System.out.printf("%d * %d: %d ",x,y,resultant);
        } else if (operation ==4 ) {
            System.out.println("Digite um número: ");
            int x = sc.nextInt();
            System.out.println("Digite um segundo número: ");
            int y = sc.nextInt();
            int resultant = x/y;
            System.out.printf("%d / %d: %d ",x,y,resultant);
        }else{
            System.out.println("Error");
        }
    }
}
