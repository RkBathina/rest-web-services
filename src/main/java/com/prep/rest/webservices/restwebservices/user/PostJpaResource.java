package com.prep.rest.webservices.restwebservices.user;

import org.springframework.web.bind.annotation.RestController;

import com.prep.rest.webservices.restwebservices.jpa.PostRepository;

@RestController
public class PostJpaResource {
	
	PostRepository postRepository;

	public PostJpaResource(PostRepository postRepository) {
		super();
		this.postRepository = postRepository;
	}
	
	

}
