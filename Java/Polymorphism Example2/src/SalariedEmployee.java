public class SalariedEmployee extends Employee{

    protected int weeklySalary;

    public SalariedEmployee(String f, String l, int ssn, int wSalary) {
        super(f, l, ssn);
        this.weeklySalary = wSalary;
    }

    @Override
    protected double earning() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString() + " salary: "+weeklySalary;
    }
}
