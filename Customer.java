package day4;

import java.util.Scanner;

public class Customer 
{
private  String name;
private  String email ;
private int age;
private double creaditLimit;
 public void  acceptInfo()
 { 
	 Scanner sc=new Scanner (System.in);
	 System.out.println("enter name");
	 name=sc.nextLine();
	 System.out.println("enter email");
	 email=sc.nextLine();
	 System.out.println("enter age");
	 age=sc.nextInt();
	 System.out.println("enter creaditLimit");
	 creaditLimit=sc.nextDouble();
	
 }
 public void displayInfo()
 {
	 System.out.println("name = "+name);
	// System.out.println("email ="+email);
	 //System.out.println("age ="+age);
	 System.out.println("CreaditLimit ="+creaditLimit);
	 		 
	 
 }
 public void setcreaditLimit( double creaditLimit)
 { 
	this.creaditLimit=creaditLimit ;
	 
 }
 public double getcreaditLimit()
 {
	 return creaditLimit;
 }
 
 

}
