package com.example.demo;

public class FizzBuzz {

	public String display(int i) {
		if(i == 15) {
			return "fizzbuzz";
		}
		
		// convert this into array of interface
		BuzzDisplay buzzDisplay=new BuzzDisplay();
		if(buzzDisplay.isValid(i)) {
			return buzzDisplay.display();
		}
//		if(i % 3 == 0) {
//			return "fizz";
//		}
		if(i % 5 == 0) {
			return "buzz";
		}
		return String.valueOf(i);
	}

}
