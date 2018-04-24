package edu.neu.maxchang39.teamin.test;

import org.junit.Test;

import junit.framework.TestCase;
import edu.neu.maxchang39.teamin.dao.PartyDao;
import edu.neu.maxchang39.teamin.model.Id;

public class PartyCreationTest extends TestCase {
	PartyDao dao = new PartyDao();
	Id user = new Id();
	
	// User can create a party
	@Test
	public void CreateParty() {
	}
}