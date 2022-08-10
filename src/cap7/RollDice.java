package cap7;

import java.security.SecureRandom;

public class RollDice {

    private static final int MAXJOGADA = 6000000;

    public static void main(String[] args) {
        SecureRandom geradorRandomico = new SecureRandom();
        int[] frequencia = new int[6];

        for (int cont =1; cont<=MAXJOGADA; cont++) {
            int lance = 1 + geradorRandomico.nextInt(6);
            ++frequencia[lance - 1];
        }

        for (int cont = 0; cont<6; cont++) {
            float freqRel = (float) frequencia[cont]/MAXJOGADA *100;
            System.out.printf("Numero de lances iguais a %d eh %d - frequencia relativa = %3.2f%%%n ", cont + 1, frequencia[cont],freqRel);
        }


    }

}
