package com.algorithm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import solutions.leetcode.*;

@SpringBootApplication
public class AlgorithmApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgorithmApplication.class, args);
		var arr = new int[]{3,2,2,3};
		var a= remove_Element.removeElement(arr,3);
	}

}
