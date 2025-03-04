package com.prep.rest.webservices.restwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prep.rest.webservices.restwebservices.user.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
