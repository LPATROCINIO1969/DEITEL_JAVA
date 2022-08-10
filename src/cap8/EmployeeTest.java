package cap8;

public class EmployeeTest {
    public static void main(String[] args) {

        System.out.printf("Employee before instantion: %d%n",Employee.getCount());

        Date birth = new Date(24,7, 1949);
        Date hire = new Date(3,12, 1988);

        Employee employee2 = new Employee("Susan", "Martin", birth,hire);
        Employee employee = new Employee("Bob", "Blue",birth,hire);
        System.out.println(employee);

    }
}
