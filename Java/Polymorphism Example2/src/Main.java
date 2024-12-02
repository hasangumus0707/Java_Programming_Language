public class Main {
    public static void main(String[] args) {

        Employee e1 = new SalariedEmployee("Hasan", "Gumus", 1654 ,100);
        Employee e2 = new HourlyEmployee("Mehmet", "Gumus", 64654, 10 , 40);
        Employee e3 = new CommisionEmployee("Fatma", "Gumus", 65454,1000, 0.1f);
        Employee e4 = new BasePlusCommissionEmployee("Kenan", "Gumus",56487,1000,0.1f,100);

        Employee[] emps = {e1, e2, e3, e4};

        for (Employee e : emps)
        {
            System.out.println(e);
            System.out.println(e.earning());
        }
    }
}