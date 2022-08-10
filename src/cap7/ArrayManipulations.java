package cap7;

import java.util.Arrays;

public class ArrayManipulations {
    public static void main(String[] args) {
        double[] doubleArray = {8.4,9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        System.out.printf("Array de double:%n");
        for (double numero:doubleArray){
            System.out.printf("%.1f ", numero);
        }

        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray,7);
        displayArray(filledIntArray, "Array preenchido com 7s");

        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray,0,intArrayCopy,0,intArray.length);
        displayArray(intArray,"Array intArray original");
        displayArray(intArray,"Array intArray copia");

        boolean b = Arrays.equals(intArray,intArrayCopy);
        System.out.printf("%nintArray %s intArrayCopy%n",(b?"==":"!="));

        b = Arrays.equals(intArray,filledIntArray);
        System.out.printf("%nintArray %s intArrayCopy%n",(b?"==":"!="));

        int location = Arrays.binarySearch(intArray,5);
        if (location>=0)
            System.out.printf("Elemento 5 encontrado na posicao %d em intArray.%n", location);
        else
            System.out.printf("Elemento 5 não encontrado em intArray.%n");

        location =Arrays.binarySearch(intArray, 8763);
        if (location>=0)
            System.out.printf("Elemento 8763 encontrado na posicao %d em intArray.%n", location);
        else
            System.out.printf("Eleemento 8763 não encontrado em intArray.%n");




    }


    public static void displayArray(int[] array, String description){
        System.out.printf("%n%s: ", description);
        for (int valor:array){
            System.out.printf("%d ", valor);
        }
    }

}
