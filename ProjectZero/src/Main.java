import java.util.Scanner;

public class Main {		
	public static void main(String[] args){
		Calculator calc = new Calculator();
		
		System.out.print("Enter two numbers: ");
		Scanner reader = new Scanner(System.in);

		for(int i = 0; i < calc.getNumberOfInputs(); i++){
			if(reader.hasNextInt()){
				int num = reader.nextInt();
				calc.addToIntegerSum(num);	
			} else if(reader.hasNextDouble()){
				double num = reader.nextDouble();
				calc.addToDoubleSum(num);
			}
		}

		calc.printSum();
	}
}
