public class ProductionWorker extends Employee {
    protected int shift;
    protected double payRate;
    protected double hoursWorked;

    public ProductionWorker(){
        super();
    }
    public ProductionWorker(String employeeName, String employeeNumber, 
    String hireDate, int shift, double payRate, double hoursWorked){
        super(employeeName, employeeNumber, hireDate);
        this.shift = shift;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public void setShift(int shift){
        this.shift = shift;
    }
    public int getShift(){
        return shift;
    }

    public void setPayRate(double payRate){
        this.payRate = payRate;
    }
    public double getPayRate(){
        return payRate;
    }

    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked(){
        return hoursWorked;
    }

    @Override
    String calculatePay(double payRate, double hoursWorked) {
        if(hoursWorked > 40){
            payRate*=2;
            return("Total Payment of Employee: " + (payRate *hoursWorked));
        }   
        else{
            return("Total Payment of Employee: " + (payRate * hoursWorked));

        }  
    }
    @Override
    public String toString(){
        return super.toString() + "ProductionWorker [Shift = " + shift + "]" + "[PayRate = " + payRate + "]" + "[HoursWorked = " + hoursWorked +"]";
    }
    
}
