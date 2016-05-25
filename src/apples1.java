import java.util.Scanner;

public class apples1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Oranges1 OrgObject = new Oranges1();
		
		System.out.println("Enter a name of girl");
		String temp = input.nextLine();
		
		//OrgObject.setName(temp);
		OrgObject.getName();
		OrgObject.saying();
		
	}

}
