package day3;

import java.util.Scanner;

public class SORT_DATA {

	public static void main(String[] args) {
		int n;
		System.out.println("enter array element ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[]a=new int[n];
		
		
	
		System.out.println("-----enter array element------");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
				
		}
		int t=0;
		System.out.println("after sort data of array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{ 
				if(a[i]<a[j])
				{
			      t=a[i];
			      a[i]=a[j];
			      a[j]=t;
			    }
				
		   }
	  } 
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("--------- maximum number---------- ");
		
		System.out.println("1st maximum number "+a[0]);
		System.out.println("2st maximum number "+a[1]);
		System.out.println("3st maximum number "+a[2]);
		
		sc.close();

	}
	

}
