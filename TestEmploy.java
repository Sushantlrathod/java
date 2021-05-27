package day5;

public class TestEmploy {

	public static void main(String[] args) {
		Employe[] e=new Employe[2];
		for(int i=0;i<e.length;i++)
		{
			e[i]=new Employe();
					e[i].acceptInfo();
		}
		for(int i=0;i<e.length;i++)
		{
			e[i].calSalary();
		}
	

	}

}
