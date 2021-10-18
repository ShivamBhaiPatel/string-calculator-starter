package calculator;

import java.util.Scanner;

class StringCalculator {

	public int add(String input) {

		String[] str = input.split("\n,");

		if (input.isEmpty()) {
			return 0;
		} 
		else if(str.length==1){
			return Integer.parseInt(str[0]);
		}
		else if (str.length > 1) {
			return getSum(str);
		}
		return stringToInt(input);
	}

	// sum ==================

	private int getSum(String[] numbers) {
		int sum = 0;
		for (String currentNumber : numbers) {
			if (stringToInt(currentNumber) > 1000) {
				continue;
			}
			sum += stringToInt(currentNumber);
		}
		return sum;
	}

	private int stringToInt(String number) {
		int n=Integer.parseInt(number);
		if(n < 0) {
			throw new IllegalArgumentException("Negative input not allowed");
		}
		else
			return Integer.parseInt(number);

	}

}