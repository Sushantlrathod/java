package day4;

public class Test_date {
	public static void main(String[] args) 
	{
		Date dob=new Date();
		
		
		dob.acceptInfo();
		
		System.out.println("------------------------");
		dob.displayInfo();
		dob.setdday(12);
		dob.getday();
		dob.setmonth(12);
		dob.getmonth();
		dob.setyear(2022);
		dob.getyear();
		System.out.println("------------------------");
		
		dob.displayInfo();

		
		
		
	}

}
