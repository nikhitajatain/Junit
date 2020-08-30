package com.example.project_test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.project.Palindrome;

class PalindromeTest {
	//private final Palindrome pal = new Palindrome();

	@ParameterizedTest
	@ValueSource(strings = { "abcdcba", "nmamn" })
	void palindromeCheckTest(String nik) {
		boolean answer = Palindrome.checkPalindrome(nik); 
		
		assertTrue(answer);
	}
}
