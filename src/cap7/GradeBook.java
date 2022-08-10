package cap7;

import java.sql.SQLOutput;

public class GradeBook {
    private String courseName;
    private int[][] grades;

    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void processGrades(){
        outputGrades();
//        System.out.printf("Nota media é %.2f%n",getAverage());
        System.out.printf("A menor nota eh %d.%nA maior nota eh %d%n", getMinimum(),getMaximum());
//        outputBarChart();
    }

    public int getMinimum(){
        int lowGrade = grades[0][0];
        for(int[] studentGrades:grades) {
            for (int grade : studentGrades)
                if (grade < lowGrade) {
                    lowGrade = grade;
                }

        }
        return lowGrade;
    }

    public int getMaximum(){
        int highGrade = grades[0][0];
        for(int[] studentGrades:grades){
            for(int grade:studentGrades)
            if (grade>highGrade){
                highGrade = grade;
            }
        }
        return highGrade;
    }

    public double getAverage(int[] setOfGrades){
        double average = 0;
        for(int grade:setOfGrades){
            average += (double)grade;
        }
        average = average/grades.length;
        return average;
    }

    public void outputGrades(){
        System.out.printf("As grades sao: %n%n");
        System.out.println("          ");

        for(int test = 0; test<grades[0].length;test++)
            System.out.printf("Teste %d  ", test + 1);

        System.out.println("Average");

        for (int cont=0; cont<grades.length; cont++){
            System.out.printf("Estudante: %2d: ", cont+1);
            for (int test:grades[cont])
                System.out.printf("%8d", test);

            double average = getAverage(grades[cont]);
            System.out.printf("%9.2f%n",average);


        }
    }




}
