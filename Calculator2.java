public class Calculator {
	private double a;
	private double b;
	
	public Calculator(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	public double getA() {
		return a;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getB() {
		return b;
	}
	public double addition() {
		return a+b;
	}
	public double subtration() {
		if (a>b)
			return a-b;
		else
			return b-a;
	}
	public double multiplication() {
		return a*b;
	}
	public double division() {
		return a/b;
	}
	public double square() {
		if(b ==0)
			return a * a;
		else
			return b * b;
	}
	public double squareRoot() {
		return Math.sqrt(a);
	}
}
