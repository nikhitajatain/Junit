package com.example.project;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {
	
	static Stream<TwoArray> arrayProvider() {
		int [] num1= {1, 2, 3, 4, 5};
		int [] num2= {6, 7, 8, 9, 10};
		
		TwoArray array1 = new TwoArray(num1, num2) ;
		TwoArray array2 = new TwoArray(num1, num2) ;
		
	    return Stream.of(array1,array2);
	}
	 
	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	 void testCalculator(int numone, int numtwo, int result) {
		 Calculator cal = new Calculator();
		 int answer = cal.addTwoNumbers(numone, numtwo);
		 Assertions.assertEquals(result, answer);
	 }
	 
	@ParameterizedTest
	@MethodSource("arrayProvider")
	 void testHistory(TwoArray a) {
		 Calculator cal = new Calculator();
				 
		 int[] numone = a.getNum1();
		 int[] numtwo = a.getNum2();
		 
		 int[] expectedHistory = {cal.addTwoNumbers(numone[0], numtwo[0]),
				 cal.addTwoNumbers(numone[1], numtwo[1]),
				 cal.addTwoNumbers(numone[2], numtwo[2]),
				 cal.addTwoNumbers(numone[3], numtwo[3]),
				 cal.addTwoNumbers(numone[4], numtwo[4])};
		 
		 Assertions.assertArrayEquals(expectedHistory, cal.getHistory());
	 }
	 
}
