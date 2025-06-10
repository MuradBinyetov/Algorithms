package com.algorithm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import solutions.leetcode.longest_Common_Prefix;
import solutions.leetcode.romanToInteger;
import solutions.leetcode.two_Sum;

@SpringBootApplication
public class AlgorithmApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgorithmApplication.class, args);
		String[] arr = new String[]{"flower","flower","flower","flower"};
		var a = longest_Common_Prefix.longestCommonPrefix(arr);

//		var a = romanToInteger.romanToInt("MCMXCIV");
//		var b =1;
//		 int[] arr = new int[] {-1,-2,-3,-4,-5};
//		var twoSum = two_Sum.twoSum(arr,-8);
	}

}
