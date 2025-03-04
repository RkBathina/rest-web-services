package com.prep.rest.webservices.restwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prep.rest.webservices.restwebservices.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
