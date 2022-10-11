public abstract class Employee {
    protected String employeeName, employeeNumber, hireDate;

    public Employee(){
        super();
    }

    public Employee(String employeeName, String employeeNumber, String hireDate){
        super();
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeNumber(String employeeNumber){
        this.employeeNumber = employeeNumber;
    }
    public String getEmployeeNumber(){
        return employeeNumber;
    }

    public void setHireDate(String hireDate){
        this.hireDate = hireDate;
    }

    public String getHireDate(){
        return hireDate;
    }

    @Override
    public String toString(){
        return "Employee [EmployeeName = " + employeeName + "]" + "[EmployeeNumber = " + employeeNumber + "]" + "\n";
    }

    abstract String calculatePay(double payRate, double hoursWorked);

    

}
