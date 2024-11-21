import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Name:");
        employee.setName(scan.nextLine());

        System.out.println("Enter Security Number: ");
        employee.setSocialSecurityNumber(scan.nextInt());

        System.out.println("Enter Wage");
        employee.setWage(scan.nextFloat());

        System.out.println("Enter Hours of Working:");
        employee.setWorkingHours(scan.nextInt());

        employee.displayInfo();
        float salary = employee.displaySalary();
        System.out.println("Salary: " +salary);

    }
}