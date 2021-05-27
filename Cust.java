package day5;

import java.util.Scanner;

public class Cust {

 private String name;
 private  String email;
 private int age;

 Cust()
 {
	this.name="riya";
	this.age=25;
	this.email="riya@gmail.com";
 }
 Cust(String name, int age ,String email)
 {
	 this.name= name;
	 this.email=email;
	 this.age=age;
	 
 }
 public void  acceptInfo() 
 {
  Scanner sc =new Scanner (System.in);
  System.out.println("enter name");
  this.name=sc.nextLine();
  System.out.println("enter email");
  this.email=sc.nextLine();
  System.out.println("enter age");
  this.age=sc.nextInt();
  
 }
 public void displayInfo()
 {
	 System.out.println("name= "+this.name );
	 System.out.println("email = "+this.email);
	 System.out.println("age="+age);
 }
 

}
