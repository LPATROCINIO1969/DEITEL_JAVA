package cap4;
import java.util.Scanner;

public class ClassAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.print("Entre com a nota ou -1 para encerrar: ");
        int grade = input.nextInt();

        while (grade!=-1){
            total = total + grade;
            gradeCounter++;

            System.out.print("Entre com a nota ou -1 para encerrar: ");
            grade = input.nextInt();
        }

        if (gradeCounter>0){
            double average = (double) total/gradeCounter;

            System.out.printf("%nTotal de %d notas eh igual a %d%n",gradeCounter, total);
            System.out.printf("Media das notas eh igual a %3.1f%n", average);
        }






    }
}
