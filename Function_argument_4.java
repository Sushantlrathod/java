package day3;

public class Function_argument_4 {

	public static void main(String[] args) {
		int c;
		c=sum(40,20);
		
		sum(20,30,60,60,40);
		System.out.println("sum is "+c);

	}
	public static int sum(int a,int b)
	{
		int s=0;
		s=a+b;
		return s;
	}
	public static void sum(int... a) {
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			s=s+a[i];
		}
		
		
		System.out.println("sum is "+s);
		
	}
	

}
