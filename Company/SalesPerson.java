package Company;

public class SalesPerson extends Employee{
    private int salesTarget;

    public SalesPerson(String name, String department, double salary, int salesTarget){
        super(name, department, salary);
        this.salesTarget = salesTarget;
    }

    public void setSalesTarget(int salesTarget){
        this.salesTarget = salesTarget;
    }

    public int getSalesTarget(){
        return salesTarget;
    }

    @Override
    public String toString(){
        return super.toString() + ", sales target: " + salesTarget;
    }
}
