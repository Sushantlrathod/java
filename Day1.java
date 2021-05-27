package day5;

import java.util.Scanner;

public class Day1 {

	
	private int day,month,year;
	public void acceptInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter day");
		day=sc.nextInt();
		System.out.println("enter month");
		month=sc.nextInt();
		System.out.println("enter year");
		year=sc.nextInt();
	}
	
	public void displayInfo()
	{
		System.out.println("date ="+day+"/"+month+"/"+year );
	}
 int  getday()
 {
	return this.day;
 }
 void setday(int day)
 {
	 this.day=day;
 }
	}

	

