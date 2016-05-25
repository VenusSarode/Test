import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		
		int age;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value from 1 to 3");
		age=scanner.nextInt();
		
		
		switch(age)
		{
		    case 1:
                System.out.println("you can crawl");
	            break;
	        case 2:
	            System.out.println("you can talk");
	            break;
	        case 3:
	            System.out.println("you can get in trouble");
	            break;
	        default:
	            System.out.println("i dnt know how old you are");
	            break;
			

		}
	}

}
