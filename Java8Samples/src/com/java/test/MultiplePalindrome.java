package com.java.test;

import java.util.ArrayList;
import java.util.List;

public class MultiplePalindrome {
	public static void main(String[] args) {
		List<String> palindromes = findAllPalindrome("abacdedefgf");
		System.out.println("Found palindromes count: " + palindromes.size());
		for (String palindrome : palindromes) {
			System.out.println(palindrome);
		}
	}
	
	static List<String> findAllPalindrome(String bigString) {
		List<String> pallindromes = new ArrayList<>();
		for (int i = 0; i <bigString.length(); i++) {
			for (int j=i+1; j<bigString.length(); j++) {
				String substring = bigString.substring(i, j+1);
				if(checkPalindrome(substring)) {
					pallindromes.add(substring);
				}
			}
		}
		return pallindromes;
	}
	
	static boolean checkPalindrome(String str) {
		int mid = str.length() / 2;
		for (int i=0, j = str.length() - 1; i <mid; i++,j--) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
