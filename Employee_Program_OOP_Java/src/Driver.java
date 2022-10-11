// Jesus Macias

// This program creates objects, stores in array, and display via terminal and file using OOP concepts.
// Driver program 

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Driver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList <Object> workers = new ArrayList<Object>();
        String position;

        while(true){
            System.out.println("Enter Employee's Position (Production Worker or Shift Supervisor): ");
            position = keyboard.nextLine();
            position = position.toLowerCase().replaceAll(" ", "");
            if(position.equals("productionworker")){ // name, number, shift, payrate, hours
                ProductionWorker productWorker = new ProductionWorker();
                System.out.println("Enter Employee Name: ");
                String enteredName = keyboard.nextLine();
                productWorker.setEmployeeName(enteredName);
                System.out.println("Enter Employee Number: ");
                String enteredEmployeeNum = keyboard.nextLine();
                productWorker.setEmployeeNumber(enteredEmployeeNum);
                System.out.println("Enter Shift (1 = day, 2 = night): ");
                int enteredShift = keyboard.nextInt();
                productWorker.setShift(enteredShift);

                System.out.println("Enter Payrate: ");
                double enteredPay = keyboard.nextDouble();
                productWorker.setPayRate(enteredPay);
                System.out.println("Enter Hours Worked: ");
                double enteredHours = keyboard.nextDouble();
                productWorker.setHoursWorked(enteredHours);

                workers.add(productWorker.toString());
                workers.add(productWorker.calculatePay(enteredPay, enteredHours));
                System.out.println("Would You Like to Enter Another Employee? Enter true/false");
                if(keyboard.hasNext("false")){
                    break;
                }

                

            }
            if(position.equals("shiftsupervisor")){
                ShiftSupervisor supervisor = new ShiftSupervisor();
                System.out.println("Enter Employee Name: ");
                String enteredName = keyboard.nextLine();
                supervisor.setEmployeeName(enteredName);
                System.out.println("Enter Employee Number: ");
                String enteredEmployeeNum = keyboard.nextLine();
                supervisor.setEmployeeNumber(enteredEmployeeNum);
            

                System.out.println("Enter Annual Salary: ");
                double enteredPay = keyboard.nextDouble();
                supervisor.setAnnualSalaray(enteredPay);
                System.out.println("Enter Bonus Earned: ");
                double enteredBonus = keyboard.nextDouble();
                supervisor.setBonusEarned(enteredBonus);

                workers.add(supervisor.toString());
                workers.add(supervisor.calculatePay(enteredPay, enteredBonus));
                System.out.println("Would You Like to Enter Another Employee? Enter true/false");
                if(keyboard.hasNext("false")){
                    break;
                }

            }
        }
        int arraySize = workers.size();
        for (int i = 0; i < arraySize; i++){
            System.out.println(workers.get(i));
        }
        
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        
            // create a new user object
        
            // write object to file
            oos.writeObject(workers);
        
            // close writer
            oos.close();
        
        } 
        catch (IOException ex) {
            ex.printStackTrace();
        }
        keyboard.close();
            

        
        

        
    
        
    }
}
// OUTPUT:
// Enter Employee's Position (Production Worker or Shift Supervisor): 
// productionworker
// Enter Employee Name: 
// Jesus Macias
// Enter Employee Number: 
// 36363
// Enter Shift (1 = day, 2 = night): 
// 1
// Enter Payrate: 
// 10.0
// Enter Hours Worked: 
// 12
// Would You Like to Enter Another Employee? Enter true/false
// true
// Enter Employee's Position (Production Worker or Shift Supervisor): 
// Enter Employee's Position (Production Worker or Shift Supervisor):
// Enter Employee's Position (Production Worker or Shift Supervisor):
// shiftsupervisor
// Enter Employee Name: 
// John Smith
// Enter Employee Number: 
// 27272
// Enter Annual Salary: 
// 50000
// Enter Bonus Earned: 
// 10000
// Would You Like to Enter Another Employee? Enter true/false
// true
// Enter Employee's Position (Production Worker or Shift Supervisor): 
// Enter Employee's Position (Production Worker or Shift Supervisor):
// Enter Employee's Position (Production Worker or Shift Supervisor):
// productionworker
// Enter Employee Name: 
// Emily Olson
// Enter Employee Number: 
// 19191
// Enter Shift (1 = day, 2 = night): 
// 2
// Enter Payrate: 
// 18.00
// Enter Hours Worked: 
// 35
// Would You Like to Enter Another Employee? Enter true/false
// true
// Enter Employee's Position (Production Worker or Shift Supervisor): 
// Enter Employee's Position (Production Worker or Shift Supervisor):
// Enter Employee's Position (Production Worker or Shift Supervisor):
// shiftsupervisor
// Enter Employee Name: 
// Elon Musk
// Enter Employee Number: 
// 99999
// Enter Annual Salary: 
// 100000 
// Enter Bonus Earned: 
// 18222221  
// Would You Like to Enter Another Employee? Enter true/false
// false
// Employee [EmployeeName = Jesus Macias][EmployeeNumber = 36363]
// ProductionWorker [Shift = 1][PayRate = 10.0][HoursWorked = 12.0]
// Total Payment of Employee: 120.0
// Employee [EmployeeName = John Smith][EmployeeNumber = 27272]
// ShiftSupervisor [AnnualSalary = 50000.0][BonusEarned = 10000.0]
// Total Payment to Employee: 60000.0
// Employee [EmployeeName = Emily Olson][EmployeeNumber = 19191]
// ProductionWorker [Shift = 2][PayRate = 18.0][HoursWorked = 35.0]
// Total Payment of Employee: 630.0
// Employee [EmployeeName = Elon Musk][EmployeeNumber = 99999]
// ShiftSupervisor [AnnualSalary = 100000.0][BonusEarned = 1.8222221E7]
// Total Payment to Employee: 1.8322221E7