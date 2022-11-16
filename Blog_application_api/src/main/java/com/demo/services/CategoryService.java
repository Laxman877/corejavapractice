package com.demo.services;

import java.util.List;

import com.demo.payloads.CategoryDto;

public interface CategoryService {
	
	//create
	CategoryDto createCaegory(CategoryDto categoryDto);
	//update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	//delete
	void deleteCategory(Integer categoryId); 
	//get
	CategoryDto getCategoryById(Integer categoryId);
	//get all
	List<CategoryDto> getAllCategories();
}
