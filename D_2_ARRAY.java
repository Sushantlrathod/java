package day3;

import java.util.Scanner;

public class D_2_ARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a=new int[3][3];
		System.out.println("enter the array elemrnt");
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt(); 
			}
		}
		System.out.println(" 2-d array is ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println( );
		}
   sc.close();
	}

}
