public class BasePlusCommissionEmployee extends CommisionEmployee {

    protected  int baseSalary;

    public BasePlusCommissionEmployee(String f, String l, int ssn , int gs, float cRate , int bSalary){
        super(f, l, ssn, gs, cRate);
        this.baseSalary = bSalary;
    }

    @Override
    protected double earning() {
        return super.earning() + baseSalary;
    }

    @Override
    public String toString() {
        return super.toString()+ "baseSalary: " + baseSalary;
    }
}
