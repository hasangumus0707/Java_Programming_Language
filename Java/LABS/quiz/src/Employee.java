public class Employee {

    private String name;
    private Days[] workingDays;


    private static int totalEmployees = 0;


    public Employee(String name, Days[] workingDays) {
        this.name = name;
        this.workingDays = workingDays;
        totalEmployees++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Days[] getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(Days[] workingDays) {
        this.workingDays = workingDays;
    }


    public static int getTotalEmployees() {
        return totalEmployees;
    }


    public void printEmployeeInfo() {
        System.out.println("Calisan Adi: " + name);
        System.out.print("Calısma Gunleri: ");
        for (Days day : workingDays) {
            System.out.print(day + " ");
        }
        System.out.println();
    }
}
