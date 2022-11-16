package com.demo.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class CategoryDto {
	
	private int categoryId;
	
	@NotBlank
	@Size(min = 4 , message = "Must be 4 chars")
	private String categoryTitle;
	
	@NotBlank
	@Size(min = 10, message = "Minimum description is 10 character")
	private String categoryDescription;
}
