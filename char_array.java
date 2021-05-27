package day3;

public class char_array {

	public static void main(String[] args) 
	{
		char[] a= {'s','u','S','H','A','N','t'};
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}
		
		System.out.println("----------------------");
		String str= String.copyValueOf(a);
		System.out.println(str);
		String s1;
		s1=str.toUpperCase();
		System.out.println(s1);
		s1=str.toLowerCase();
		System.out.println(s1);
		
	}

}
