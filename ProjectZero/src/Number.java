public class Number {
	/**
	 * Returns a boolean value indicating whether an int is in binary format.
	 *
	 * @param  number  an int given to be checked whether it is in binary format.
	 * @return         a boolean value
	 * @see            Number
	 */
	public static boolean isBinary(int number) { 
		int n = number; 
		while (n != 0) { 
			if (n % 10 > 1) { return false; } 
			n = n / 10; 
		} 
		return true; 
	}
}
