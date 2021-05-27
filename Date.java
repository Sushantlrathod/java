package day4;

import java.util.Scanner;

public class Date 
{
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
void setdday(int day) 
{
	this.day=day;
}
int getday()
{
	return this.day;
}

void setmonth(int month) 
{
	this.month=month;
}
int getmonth()
{
	return this.month;
}
void setyear(int year) 
{
	this.year=year;
}
int getyear()
{
	return this.year;
}

}
