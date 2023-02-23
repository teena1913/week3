package week3.day2;

public class Automation extends Multiplelanguage implements Language,Testtool {
	public static void main(String[] args) {
		Automation aa=new Automation();
		aa.java();
		aa.Selenium();
		aa.ruby();
		aa.python();
	}
	

	public void Selenium() {
		System.out.println("selenium course");
		
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("jaavscript");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("rubycourse");
	}
	}


