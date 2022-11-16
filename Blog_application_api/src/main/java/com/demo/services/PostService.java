package com.demo.services;

import java.util.List;

import com.demo.model.Post;
import com.demo.payloads.PostDto;
import com.demo.payloads.PostResponse;

public interface PostService {
	
	//create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	//update
	PostDto updatePost(PostDto postDto, Integer postId);
	//delete
	void deletePost(Integer postId);
	//get all post
	PostResponse getAllPost(Integer pageNumber, Integer pageSize,String sortBy,String sortDir);
	//get single post
	PostDto getPostById(Integer postId);
	//get single post by category
	List<PostDto> getPostBycategory(Integer categoryId);
	//get single post by user
	List<PostDto> getPostByUser(Integer UserId);
	//search post
	List<PostDto> searchPosts(String keyword);
	
}
