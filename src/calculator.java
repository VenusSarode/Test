import java.util.Scanner;




public class calculator {

	public static void main(String[] args) {
	
	Scanner scanner= new Scanner(System.in);
	double num1,num2,answer;
	
	System.out.println("Enter first number");
	num1=scanner.nextDouble();
	
	System.out.println("Enter second number");
	num2=scanner.nextDouble();
	
	answer=num1+num2;
	System.out.println(answer);
	
	
	
	}

}
