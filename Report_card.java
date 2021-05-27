package day2;

import java.util.Scanner;

public class Report_card {
	public static void main(String[] args) {
		
	
	int roll_num,s1,s2,s3,s4,s5,sum;
	float avg;
	String name;
	System.out.println("enter name:");
	Scanner sc= new Scanner(System.in);
	name=sc.nextLine();
	System.out.println("enter roll number:");
	
    roll_num=sc.nextInt();
    System.out.println("enter 5 subject mark out of 100");
    s1=sc.nextInt();
    s2=sc.nextInt();
    s3=sc.nextInt();
    s4=sc.nextInt();
    s5=sc.nextInt();
    sum=(s1+s2+s3+s4+s5);
    avg=(sum/5);
    System.out.println("sum is "+sum+ " average="+avg);
    
    if(avg>=75)
    	System.out.println("geead is A");
    else if(avg<74 && avg>60)
    	System.out.println("gread is B");
    else if(avg<=60)
    		System.out.println("gread is c");
    
    sc.close();
    
    
}
}