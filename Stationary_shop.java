package day2;

import java.util.Scanner;

public class Stationary_shop {

	public static void main(String[] args) {
		
		
		System.out.println("1:pen rs10");
		System.out.println("2:pencil rs5");
		System.out.println("3:notbook rs20");
		System.out.println("4:bottel rs30");
		System.out.println("5:colour_box rs50");
		System.out.println("6:for total amount ");
		
		Scanner sc = new Scanner(System.in);
		boolean flag =true;
		
		int c,sum=0,q ;
		while(flag!=false)
		{
			System.out.println("enter choice");
			c=sc.nextInt();
			
			switch(c)
			{
			case 1: System.out.println("enter pen quantity");
			q=sc.nextInt();
			sum=sum+(q*10);
			; break;
			case 2:System.out.println("enter pencil quantity");
			q=sc.nextInt();
			sum=sum+(q*5);
			; break;
			case 3: System.out.println("enter notbook quantity");
			q=sc.nextInt();
			sum=sum+(q*20);
			; break;
			case 4:System.out.println("enter bottel quantity");
			q=sc.nextInt();
			sum=sum+(q*30);
			; break;
			case 5:System.out.println("enter colour_box quantity");
			q=sc.nextInt();
			sum=sum+(q*50);
			; break;
			case 6:flag=false;
				break;
			default: System.out.println("invalid input");
			}
			System.out.println("total amount you have to pay is="+sum);
		}
		sc.close();

	}

}
