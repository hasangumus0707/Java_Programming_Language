public class Employee {

    String name = "Ahmet";
    int socialSecurityNumber = 221020;
    float wage= 10.5f ;
    int workingHours = 8;

    public void displayInfo(){

        System.out.println(name);
        System.out.println(socialSecurityNumber);
    }

    public float displaySalary(float wage , int workingHours){

        return wage*workingHours;
    }

}
