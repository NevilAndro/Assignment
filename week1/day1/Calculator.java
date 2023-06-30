package week1.day1;

public class Calculator {

	private void add(int a, int b) {
		
		System.out.println(a+b);
		
	}
	private void sub(int a, float b) {
		
		System.out.println(a-b);
		

	}
	private void mul(float a, double b) {
		
		System.out.println(a*b);
		
	}
	private void div(float a, int b) {
		System.out.println(a/b);
		
	}
	
	public static void main(String[] args) {
		
		Calculator calc=new Calculator();
		calc.add(10, 20);
		calc.sub(25, 9.2f);
		calc.mul(4.2f, 332.2d);
		calc.div(33.2f, 20);
	}

}
