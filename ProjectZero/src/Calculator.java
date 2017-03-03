import java.util.ArrayList;

public class Calculator{
	private String sum;
	private int integerSum = 0;
	private double doubleSum = 0;
	private int numberOfInputs = 2;
	private int binaryInputCount = 0;

	/**
	 * Sets a value to numberOfInputs upon object creation. 
	 *
	 * @param  numberOfInputs	 a value of type int indicating 
	 * the number of inputs from the console that will be calculated 
	 * @return     No return value
	 * @see        Calculator
	 */ 
	Calculator(int numberOfInputs){
	  this.numberOfInputs = numberOfInputs;	
	}
	
	/**
	 * Sets a value to numberOfInputs. 
	 *
	 * @param  numberOfInputs	 a value of type int indicating 
	 * the number of inputs from the console that will be calculated 
	 * @return     No return value
	 * @see        Calculator
	 */ 
	public void setNumberOfInputs(int numberOfInputs){
		this.numberOfInputs = numberOfInputs;
	}
	
	/**
	 * Gets the value of numberOfInputs. 
	 *
	 * @return     returns the value of numberOfInputs
	 * @see        Calculator
	 */ 
	public int getNumberOfInputs(){
		return numberOfInputs;
	}
	
	/**
	 * Sums all the values in an array of type int and assigns 
	 * it to the private int variable integerSum. 
	 *
	 * @param  integers	 an array of int values to be summed. 
	 * @return     No return value
	 * @see        Calculator
	 */ 
	public void setIntegerSum(int[] integers){
		for(int i : integers){ 
			if(Number.isBinary(i)){
				integerSum += Integer.parseInt(i+"", 2); 
				binaryInputCount++;
			} else {
				integerSum += i; 
			}
		}
	}
	
	/**
	 * Sums all the values in an array of type double and assigns 
	 * it to the private double variable doubleSum. 
	 *
	 * @param  doubles	 an array of double values to be summed. 
	 * @return     No return value;
	 * @see        Calculator
	 */ 
	public void setDoubleSum(double[] doubles){
		for(double d : doubles){ doubleSum += d; }
	}
	
	/**
	 * Assigns <b>sum</b> of type String a summed value of user 
	 * input. <p>Calculates and returns a sum based on whether
	 * user input consisted <br>of only integers, binary readable integers, doubles, or a 
	 * combination of the two types.
	 *
	 * @return     No return value;
	 * @see        Calculator
	 */ 
  public void setSum(){
		if(doubleSum != 0 && integerSum != 0){
			sum = Double.toString(doubleSum += integerSum);
		} else if (doubleSum != 0){
			sum = Double.toString(doubleSum);
		} else if (integerSum != 0){
			if (binaryInputCount == numberOfInputs){
				sum = Integer.toBinaryString(integerSum);
			} else {
				sum = Integer.toString(integerSum);
			}

		} 	
  }
  
	/**
	 * Gets the String value of sum.
	 *
	 * @return     returns a String
	 * @see        Calculator
	 */ 
  public String getSum(){
  	return sum;
  }
  
	/**
	 * Calls setDoubleSum() and setIntegerSum()
	 * to set the sum of all double values to doubleSum <br>and the
	 * sum of all int values to integerSum. Before calling setSum();
	 *
	 * @param  integers	 an array of int values. 
	 * @param  doubles	 an array of double values. 
	 * @return     No return value
	 * @see        Calculator
	 */ 
  public void calculateSum(int[] integers, double[] doubles){
  	setDoubleSum(doubles);
  	setIntegerSum(integers);
  	setSum();
  }	
}
