package com.algorithm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import solutions.leetcode.*;

@SpringBootApplication
public class AlgorithmApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgorithmApplication.class, args);
        int[] nums = {3,2,1};
        number_Of_Segments_In_String.countSegments("                ");
	}

}
