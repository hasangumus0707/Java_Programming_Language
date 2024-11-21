public class Main {
    public static void main(String[] args) {

    Employee emp1 = new Employee(45 , "ahmet" , 4654) ;
    Employee emp2 = new Employee(45 , "hasan" , 4654) ;
    Employee emp3 = new Employee(45 , "omer" , 4654) ;
    Employee emp4 = new Employee(45 , "selena" , 4654) ;

    Employee[] emps = {emp1 , emp2 , emp3 , emp4};

    Company comp = new Company( emps , CompanyName.GOOGLE);

        for(Employee e : emps)
        {
            System.out.println(e.getName());
            System.out.println(e.id);
            System.out.println(e.ssn );
        }
    }
}