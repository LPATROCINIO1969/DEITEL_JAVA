package cap2;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int sum;

        System.out.print("Entre com o primeiro numero: ");
        number1 = input.nextInt();
        System.out.print("Entre com o segundo numero: ");
        number2 = input.nextInt();
        sum = number1 + number2;
        System.out.printf("A soma dos numeros: %d + %d = %d", number1, number2, sum);




    }
}
