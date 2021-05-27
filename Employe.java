package day5;

import java.util.Scanner;

public class Employe {

   private 	int Empid;
	private String name;
	private String address;
	private double salary;
	
	public void acceptInfo()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter employ id");
		this.Empid= sc.nextInt();
		sc.nextLine();
		System.out.println("enter employ name ");
		this.name=sc.nextLine();
		System.out.println("enter employ add ");
		this.address= sc.nextLine();
		System.out.println("enter employ salary");
		this.salary=sc.nextDouble();
		
	}
	public void displayInfo()
	{
		System.out.println("Employ id="+Empid );
		System.out.println("Employ name="+name );
		System.out.println("Employ address="+address);
		System.out.println("Employ salary="+salary );
	}
	void calSalary()
	{
		if(this.salary>20000)
		{
			displayInfo();
		}
	}
	
}
