import java.util.Scanner;

public class ProjectZero {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter two numbers, separated by whitespace: ");
		
		if (cin.hasNextInt()) {
			int first = cin.nextInt();
			if (cin.hasNextInt()) {
				int second = cin.nextInt();
				int sum = first + second;
				System.out.println("The sum of " + first + " and " + second + " is " + sum);
						
			}
		}		
	}
}
