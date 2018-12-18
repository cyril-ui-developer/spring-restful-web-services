package com.julyseventh.restful.webservices.restfulwebservices.user;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Component;

import java.util.Iterator;


@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	private static int userCount = 3;
	
	static {
		users.add(new User(1, "Cyril", new Date()));
		users.add(new User(2, "Faith", new Date()));
		users.add(new User(3, "Meek", new Date()));
	}

	public List<User> findAll(){
		return users;
	}

	public User save(User user){
		if(user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for(User user: users) {
			if(user.getId()== id) {
				return user;
			}
		}
		return null;
	}
	
	public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}
}
