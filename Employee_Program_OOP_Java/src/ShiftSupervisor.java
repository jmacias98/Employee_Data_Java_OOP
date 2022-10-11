public class ShiftSupervisor extends Employee {
    protected double annualSalary, bonusEarned;

    public ShiftSupervisor(){
        super();
    }
    public ShiftSupervisor(String employeeName, String employeeNumber, 
    String hireDate, double annualSalary, double bonusEarned){
        super(employeeName, employeeNumber, hireDate);
        this.annualSalary = annualSalary;
        this.bonusEarned = bonusEarned;
    }

    public void setAnnualSalaray(double annualSalary){
        this.annualSalary = annualSalary;
    }
    public double getAnnualSalary(){
        return annualSalary;
    }

    public void setBonusEarned(double bonusEarned){
        this.bonusEarned = bonusEarned;
    }
    public double getBonusEarned(){
        return bonusEarned;
    }

    @Override
    public String toString(){
        return super.toString() + "ShiftSupervisor [AnnualSalary = " + annualSalary + "]" + "[BonusEarned = " + bonusEarned + "]";
    }

    @Override
    String calculatePay(double payRate, double hoursWorked) {
        return ("Total Payment to Employee: " + (annualSalary + bonusEarned));
    }
    
}
