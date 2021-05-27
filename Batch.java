package day5;


import java.util.Scanner;

public class Batch {
	public int batchno;
	public void acceptinfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter batch no.");
		batchno=sc.nextInt();
		sc.close();
	}
	public void displayinfo()
	{
		System.out.println("batchno:"+batchno);
	}

}
