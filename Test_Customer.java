package day4;

import java.util.Scanner;

public class Test_Customer {

	public static void main(String[] args) {
		double d;
		Customer c1=new Customer();
		c1.acceptInfo();
		c1.displayInfo();
		System.out.println("you want to increase your creadit limit(y/n)");
		Scanner sc=new Scanner (System.in);
		char c = sc.next().charAt(0);
		
		if(c=='y')
		{
		c1.getcreaditLimit();
		System.out.println("enter new creadit limit");
		 d=sc.nextDouble();
		c1.setcreaditLimit(d);
		}
		
		c1.displayInfo();
		
		sc.close();

	}

}

