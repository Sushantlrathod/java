package day2;

import java.util.Scanner;

public class Gross_salary {

	public static void main(String[] args) {
		double salary;
		double da=1,hra=1;
		Scanner sc= new Scanner(System.in);
		System.out.println(" basic salary is ");
		salary=sc.nextInt();
		if(salary<=10000)
		{
			hra=(0.20)*salary;
			da=(0.80)*salary;
		}
		else if (salary>10000&& salary<=20000)
		{
			hra=(0.25)*salary;
			da=(0.90)*salary;
		}
		else if (salary>20000)
		{
			hra=(0.30)*salary;
			da=(0.95)*salary;
		
		}
		salary= salary+hra+da;
		
		System.out.println("hra="+hra);
		System.out.println("da="+da);
		System.out.println("basic salary is "+salary);
			

	}

}
