package cap3;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account myAccount1 = new Account("Maria Alcantara", 2000.0);
        Account myAccount2 = new Account("Joao Santana", 5390.0);

        System.out.printf("O saldo inicial de %s eh igual a %6.2f\n", myAccount1.getName(),myAccount1.getBalance());
        System.out.printf("O saldo inicial de %s eh igual a %6.2f\n", myAccount2.getName(),myAccount2.getBalance());

        System.out.printf("Entre com o deposito na conta de %s: ", myAccount1.getName());
        double valorDeposito = input.nextDouble();
        myAccount1.deposit(valorDeposito);
        System.out.printf("Novo balanco da conta de %s eh %6.2f\n", myAccount1.getName(), myAccount1.getBalance());


        System.out.printf("Entre com o deposito na conta de %s: ", myAccount2.getName());
        valorDeposito = input.nextDouble();
        myAccount2.deposit(valorDeposito);
        System.out.printf("Novo balanco da conta de %s eh %6.2f\n", myAccount2.getName(), myAccount2.getBalance());



    }
}
