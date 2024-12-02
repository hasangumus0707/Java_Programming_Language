public class HourlyEmployee  extends Employee{

    protected int wage;
    protected int hours;

    public HourlyEmployee(String f, String l, int ssn, int wage, int hours ) {

        super(f, l, ssn);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    protected double earning() {

        if (hours <= 40) {
            return wage*hours;
        }
        else {
            return 40*wage + (hours-40)* wage*1.5f;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "wage: "+ wage +" hours: "+hours;
    }
}
