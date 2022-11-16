package com.practice.exceptions;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MyException extends RuntimeException {
	
	String resourceName;
	String fieldName;
	long fieldValue;

	public MyException(String resourceName, String fieldName, long fieldValue) {
		super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

}
