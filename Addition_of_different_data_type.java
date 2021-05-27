package day2;

public class Addition_of_different_data_type 
{
	public static void sum(int a,int b)
	{
		System.out.println("1)sum="+(a+b));
		
	}
	public static void sum(int a,int b,double c)
	{
		System.out.println("2)sum="+(a+b+c));
	}
	public static void sum(double a,int c)
	{
		System.out.println("3)sum="+(a+c));
	}
	public static void sum(char s,char a)
	{
		System.out.println("4)sum="+(s+a));
	}
	public static void sum(String a, String c)
	{
		System.out.println("sum="+(a+c));
	}
	public static void sum(char a)
	{
		System.out.println("sum="+a);
	}
	
public static void main(String[] args)
{
	
	sum(10,20);
	sum(10,30,10.5);
	sum(10.3,20);
	sum('A','S');
	sum("A","C");
	sum('A');
	
}
}
