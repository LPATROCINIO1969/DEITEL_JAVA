package cap7;

public class GradeBookTest {
    public static int[][] grade = {{87, 68,94},
                                   {100,83, 78},
                                   {85, 91, 76},
                                   {87, 31, 68}};


    public static void main(String[] args) {
        GradeBook myGradeBook = new GradeBook("CS101 - Introduction to Java Programming", grade);

        System.out.printf("Bem vindo ao Grade book for %n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }

}
