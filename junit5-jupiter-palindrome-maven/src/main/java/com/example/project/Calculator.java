package com.example.project;

class Calculator {

	private int[] history = new int[5];
	private int counter = 0;

	public int addTwoNumbers(int a, int b) {
		int sum = a + b;
		history[counter] = sum;
		counter = counter + 1;
		if (counter == 5) {
			counter = 0;
		}
		return (sum);
	}
	
	public int[] getHistory() {
		return (history);
	}
}