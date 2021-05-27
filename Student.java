package day5;


public class Student {
	public int rollno;
	public String name;
	private char grade;
	  Double totalmarks;
	
	public void acceptinfo(int rollno,char grade,Double totalmarks)
	{
		this.rollno=rollno;
		//this.name=name;
		this.grade=grade;
		this.totalmarks=totalmarks;
		
	}
	public void displayinfo()
	{
		System.out.println("rollno:"+rollno);
		System.out.println("name:"+name);
		System.out.println("grade:"+grade);
		System.out.println("totalmarks:"+totalmarks);
	}

}
