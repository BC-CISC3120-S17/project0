
public class Calculator {
	private int numberOfInputs = 2;
	private String inputValues = "";
	private int integerSum;
	private double doubleSum;
	private int binaryInputCount;


	Calculator(){ }
	
	/**
	 * Constructor to create a new instance of Calculator
	 * with a custom input value. This constructor sets the 
	 * value of numberOfInputs.
	 * 
	 * @param numberOfInputs	determines the number of inputs to handle.
	 */
	Calculator(int numberOfInputs){
		this.numberOfInputs = numberOfInputs;
	}
	
	/**
	 * This method always returns the value of numberOfInputs.
	 * @return	current value numberOfInputs.
	 */	
	int getNumberOfInputs(){
		return numberOfInputs;
	}
	
	/**
	 * This method concatenates all the user input values into 
	 * a string. 
	 * 
	 * @param inputValue	The latest value input from the console.
	 * @return						This method does not return a value.
	 */	
	private void collectInputValue(String inputValue){
		this.inputValues += inputValue;
	}
	
	/**
	 * This method receives an int value to add to the current value of 
	 * intgerSum and to pass to the collectInputValue() method.
	 * 
	 * @param integer		The latest input integer value from the console.
	 * @return					This method does not return a value.
	 */	
	void addToIntegerSum(int integer){
		if(Number.isBinary(integer)){
			this.integerSum += Integer.parseInt(integer+"", 2);
			incrementBinaryInputCount();
		} else {
			this.integerSum += integer;
		}
		collectInputValue(integer + ",");
	}

	
	/**
	 * This method receives a double value to add to
	 * the current value of doubleSum and to pass to the 
	 * collectInputValue() method; 
	 * 
	 * @param double		The latest input double value from the console.
	 * @return					This method does not return a value.
	 */	
	void addToDoubleSum(double integer){
		this.doubleSum += integer;
		collectInputValue(integer + ",");
	}
	
	/**
	 * Increments the binaryInputCount to keep track of how many inputs
	 * were readable in binary format.  
	 */	
	void incrementBinaryInputCount(){
		this.binaryInputCount++;
	}
  
	
	/**
	 * This method prints the values inputed from the console along with
	 * there respective sum.  
	 */	
	void printSum(){
		System.out.print("The sum of " + String.join(" and ", inputValues.split(",")) + " is ");
		if(doubleSum != 0 && integerSum != 0){
			doubleSum += integerSum;
			System.out.print(doubleSum);
		} else if (doubleSum != 0){
			System.out.print(doubleSum);
		} else if (integerSum != 0){
			if (binaryInputCount == numberOfInputs){
				System.out.print(Integer.toBinaryString(integerSum));		
			} else {
				System.out.println(integerSum);
			}
		}
		System.out.print(".");
	}
}
