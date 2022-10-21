//class name exp3

import java.util.*;
class Employee{
    Scanner sc = new Scanner(System.in);
    int empid;
    String empContactNumber;
    String empName;
    void enterInfo(){
        System.out.println("Enter Employee Information\n");
        System.out.println("Enter employee ID");
        empid=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter employee Name");
        empName=sc.nextLine();
        System.out.println("Enter Contact Name");
        empContactNumber=sc.nextLine();
        System.out.println("\n\n");
    }
    void showInfo(){
        System.out.println("Employee ID: "+ empid);
        System.out.println("Employee Name: "+  empName);
        System.out.println("Emp Contact no: "+ empContactNumber +"\n");
        }
}
public class exp3 {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.enterInfo();
        Employee emp2=new Employee();
        emp2.enterInfo();
        emp1.showInfo();
        emp2.showInfo();
         
    }
}

