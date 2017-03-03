import java.util.*;

public class Main {		
	public static void main(String[] args){
		String inputValues = "";
		Calculator c = new Calculator(2);
		Scanner reader = new Scanner(System.in);
		int[] integers = new int[c.getNumberOfInputs()];
		double[] doubles = new double[c.getNumberOfInputs()];
		
		System.out.print("Enter two numbers: ");
		
		for(int i = 0; i < c.getNumberOfInputs(); i++){
			if(reader.hasNextInt()){
				integers[i] = reader.nextInt();
				inputValues += Integer.toString(integers[i]) + ",";
			} else if(reader.hasNextDouble()){
				doubles[i] = reader.nextDouble();
				inputValues += Double.toString(doubles[i]) + ",";
			}
		}
		
		c.calculateSum(integers, doubles);
		
		System.out.print("The sum of ");
		System.out.print(String.join(" and ", inputValues.split(","))); 
		System.out.print(" is " + c.getSum());
	}
}
