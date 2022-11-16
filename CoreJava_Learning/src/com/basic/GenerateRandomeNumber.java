package com.basic;

import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

public class GenerateRandomeNumber {
	public static void main(String[] args) {
		//Approach - Random
		Random rand=new Random();
//		int rand_int=rand.nextInt(999);
//		System.out.println(rand_int);
//		
//		double rand_dbl=rand.nextDouble();
//		System.out.println(rand_dbl);
		
		//Approach -Math
		//System.out.println(Math.random());
		
		//Approach -Apache commons api
		String randNum=RandomStringUtils.randomNumeric(5);
		System.out.println(randNum);
		
		String randomstr=RandomStringUtils.randomAlphabetic(5);
		System.out.println(randomstr);
	}
}
