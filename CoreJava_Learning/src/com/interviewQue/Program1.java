package com.interviewQue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program1 {
	public static void main(String[] args) {
		Patient p1=new Patient("p1", 20,"Corona", 18000);
		Patient p2=new Patient("p2", 26,"Fever", 6000);
		Patient p3=new Patient("p3", 29,"Corona", 8000);
		Patient p4=new Patient("p4", 23,"Corona", 12000);
		
		List<Patient> patients=Arrays.asList(p1, p2, p3, p4);
		
		//patients.stream().filter(p ->p.getDisease().equals("Corona")).forEach(System.out::println);

		//patients.stream().filter(p ->p.getDisease().equals("Corona") && p.getAge() < 25).forEach(System.out::println);
		
		double averagebillamount= patients.stream().filter(p -> p.getDisease().equals("Corona"))
		.collect(Collectors.averagingDouble(Patient::getAmount));
		
		System.out.println("Average bill amount of corona patients : "+averagebillamount);
	}
}
