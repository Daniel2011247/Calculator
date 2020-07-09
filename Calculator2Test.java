import java.util.Scanner;
public class CalculatorTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = sc.nextDouble();
		System.out.print("Enter b: ");
		double b = sc.nextDouble();
		
		Calculator obj = new Calculator(a,b);
		
		
		
		
		System.out.printf("the Adition =%f%nthe subtration = %f%nthe multiplication = %f%nthe division = %f%nthe square = %f%nthe squareRoot= %f%n", obj.addition(), obj.subtration(), obj.multiplication(), obj.division(), obj.square(), obj.squareRoot());
	}
}
