public class main {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.displayInfo();

        float salary = employee.displaySalary(employee.wage , employee.workingHours);

        System.out.println(salary);
    }
}