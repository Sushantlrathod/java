package day2;

import java.util.Scanner;

public class Reverce_array_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter array elemengt");
		for( int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("-----------------");
		System.out.println("array element");
		for( int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println( );
		System.out.println("reverce array");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
				sc.close();

	}

}
