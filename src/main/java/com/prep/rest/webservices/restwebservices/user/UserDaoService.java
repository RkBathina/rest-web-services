package com.prep.rest.webservices.restwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;


@Component
public class UserDaoService {
	
	private static final List<User> USERS_LIST = new ArrayList<User>();
	
	private static int count =0;
	
	static {
		USERS_LIST.add(new User(++count, "Kittu Bathina", LocalDate.now().minusYears(25)));
		USERS_LIST.add(new User(++count, "Bathina", LocalDate.now().minusYears(30)));
		USERS_LIST.add(new User(++count, "Krishna", LocalDate.now().minusYears(21)));
	}
	
	public List<User> findAll(){
		return USERS_LIST;
	}

	public User findById(int id) {
		Predicate<? super User> Predcate = user -> user.getId().equals(id);
		return USERS_LIST.stream().filter(Predcate).findFirst().orElse(null);
	}

	public User save(User user) {
		user.setId(++count);
		USERS_LIST.add(user);
		return user;
	}
	
	
	public void deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		USERS_LIST.removeIf(predicate);
	}




}
