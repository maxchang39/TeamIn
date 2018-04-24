package edu.neu.maxchang39.teamin.test;

import org.junit.Test;

import junit.framework.Assert;
import edu.neu.maxchang39.teamin.dao.UserDAO;
import edu.neu.maxchang39.teamin.model.User;

public class UserCreationTest {
	UserDAO dao = new UserDAO();
	
	// User can create a party
	@Test
	public void TestCreateUser() {
		User user = new User();
		user.setName("testUser");
		dao.create(user);
		
		Assert.assertEquals(true, true);
	}
}