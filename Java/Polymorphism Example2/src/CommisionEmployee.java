public class CommisionEmployee extends Employee{

    protected int grossSale;
    protected float commissionRate;

    public CommisionEmployee(String f, String l, int ssn, int gs, float cRate) {
        super(f, l, ssn);
        this.grossSale = gs;
        this.commissionRate = cRate;
    }

    @Override
    protected double earning() {
        return grossSale * commissionRate;
    }

    @Override
    public String toString() {
        return super.toString() + " gross: "+grossSale+" cRate: "+commissionRate;
    }
}
