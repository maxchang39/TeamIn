package edu.neu.maxchang39.teamin.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import edu.neu.maxchang39.teamin.model.Id;
import edu.neu.maxchang39.teamin.model.User;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Component
public class PartyDao {

	// Dummy database. Initialize with some dummy values.
	private static List<User> users;
	{
	}

	public void createParty(Id user) {
	}
}