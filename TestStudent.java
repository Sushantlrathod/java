package day5;

//import day2.day5.Student;
//import day2.day5.Batch;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Batch o1=new Batch();
		o1.acceptinfo();
		o1.displayinfo();
		Student o2=new Student();
		o2.name="shan";
		o2.acceptinfo(101,'A',500.89);
		o2.displayinfo();
		

	}

}
