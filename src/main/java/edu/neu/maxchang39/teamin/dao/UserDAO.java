package edu.neu.maxchang39.teamin.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;
import edu.neu.maxchang39.teamin.model.User;

@Component
public class UserDAO {
	EntityManager entityManager;

	// Dummy database. Initialize with some dummy values.
	private static List<User> users;
	{
		users = new ArrayList<User>();
	}
	
	public UserDAO() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
	}

	public List<User> list() {
		return users;
	}
	
	public User create(User user) {
		//user.setId(System.currentTimeMillis());
		//users.add(user);
		
		entityManager.merge(user);
		entityManager.getTransaction().commit();
		return user;
	}

	public User update(Long id, User user) {
		return null;
	}

	public Object delete(Long id) {
		return null;
	}

	public User get(Long id) {
		return null;
	}

}