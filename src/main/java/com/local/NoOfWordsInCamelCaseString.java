package com.local;

public class NoOfWordsInCamelCaseString {

	public static void main(String[] args) {
	    System.out.println(getValue("thisContainsFourWords"));
	}

	private static long getValue(String input) {
		return input.isEmpty() ? 0 : 1 + input.chars().filter(Character::isUpperCase).count();
	}

}
