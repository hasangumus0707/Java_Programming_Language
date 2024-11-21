import java.util.Scanner;

public class Employee {

    Scanner scan = new Scanner(System.in);

    private String name;
    private int socialSecurityNumber;
    private float wage;
    private int workingHours;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getSocialSecurityNumber() {

        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {

        this.socialSecurityNumber = socialSecurityNumber;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public void displayInfo() {

        System.out.println(name + " " + socialSecurityNumber);

    }

    public float displaySalary() {

        return getWage() * getWorkingHours();
    }

}
