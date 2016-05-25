import java.util.Scanner;

public class apples {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		Oranges orangesObject = new Oranges();
		
		
		
		System.out.println("Enter your name here");
		String name = input.nextLine(); 
		
		orangesObject.simpleMessage(name);
		
	}

}
