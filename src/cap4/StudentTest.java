package cap4;

public class StudentTest {
    public static void main(String[] args) {
        Student aluno1 = new Student("Joao da Silva", 59.5);
        Student aluno2 = new Student("Maria Aparecida", 99.3);

        System.out.printf("O aluno %s apresentou conceito igual a %s\n",aluno1.getName(),aluno1.getLetterGrade());
        System.out.printf("O aluno %s apresentou conceito igual a %s\n",aluno2.getName(),aluno2.getLetterGrade());

    }
}
