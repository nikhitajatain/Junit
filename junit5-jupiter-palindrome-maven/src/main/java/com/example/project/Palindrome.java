/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import org.apache.commons.lang3.StringUtils;

public class Palindrome {

	public boolean truePalindrome(String args) {
		return true;
	}

	public static boolean checkPalindrome(String mnk) {
		String reversedString = StringUtils.reverse(mnk);

		// String reversedString = "Nikhita";

		return mnk.equals(reversedString);

	}
}
