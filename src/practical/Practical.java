import java.util.Scanner;

public class Practical {
	
	public static void main(String []args){
		
		String name;
		int year;
		float target;		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		name = scan.nextLine();
		
		System.out.print("Enter your year of study : ");
		year = scan.nextInt();
		
		System.out.print("What is your target GPA for this semester? ");
		target = scan.nextFloat();
		
		System.out.print("\nWelcome " + name + "!\n");
		System.out.print("Work hard to achieve your target GPA of " + target + " this semester of your Year " + year + ".");
	}
}