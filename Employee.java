package day4;

import java.util.Scanner;

public class Employee {
	
private double BasicSalary ;
private double HRA ;
private double Medical ;
private double PF;
private double PT ;
private double NetSalary;
private double GrossSalary;
private int EmployeeId ;
private String EmployeeName ;

   public void acceptinfo()
	{
	System.out.println("enter Employee details");
	Scanner sc=new Scanner (System.in);
	System.out.println("employee id");
	EmployeeId=sc.nextInt();
	sc.nextLine();
	System.out.println("employee name");
	EmployeeName=sc.nextLine();
	System.out.println("BasicSalary");
	BasicSalary= sc.nextDouble();
	
	}
  public void calSalary()
   {
	   this.HRA=(0.5)*BasicSalary;
	   this.PF=(0.12)*BasicSalary;
	   this.PT=200;
	   this.Medical=1000;
	  this.GrossSalary= BasicSalary + HRA+ Medical;
	  this.NetSalary= GrossSalary -( PT +PF);	  

   }
 public void displayInfo()
   {
	   System.out.println("Employeeid= "+EmployeeId);
	   System.out.println("Employee name= "+EmployeeName);
	   System.out.println("Basic salary= "+BasicSalary);
	   System.out.println("Gross Salary= "+GrossSalary);
	   System.out.println("Net Salary= "+NetSalary);
   }
}
