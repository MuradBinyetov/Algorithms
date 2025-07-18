package com.algorithm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import solutions.leetcode.*;

@SpringBootApplication
public class AlgorithmApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgorithmApplication.class, args);
		number_of_1_Bits.hammingWeight(11);
	}

}
