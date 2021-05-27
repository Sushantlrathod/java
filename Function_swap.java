package day2;

import java.util.Scanner;

public class Function_swap {

	public static void main(String[] args) {
		swap();

	}
	public static void swap()
	{
		int n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("n1=");
		n1=sc.nextInt();
		System.out.println("n2=");
		n2=sc.nextInt();
		n3=n1;
		n1=n2;
		n2=n3;
		System.out.println("n1="+n1+"   n2="+n2);
		
		sc.close();
	}

}
