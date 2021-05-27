package day3;

import java.util.Scanner;

public class Merge_array {

	public static void main(String[] args) {
		int[][]a=new int[2][2];
		int[][]b=new int[2][2];
		System.out.println("-----enter array element------");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("after merge data of array");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				b[i][j]=a[i][j];
				
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(b[i][j]+" ");
				
			}
			System.out.println();
		}
		
	sc.close();	
	}

}
