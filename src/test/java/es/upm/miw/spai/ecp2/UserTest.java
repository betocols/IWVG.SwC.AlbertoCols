package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest{
	
	User user;
	
	@Before
	public void before() {
		user = new User(555555555, "Alberto", "Cols");
	}

	@Test
	public void testUserIntStrStr() {
		assertEquals("Cols", this.user.getFamilyName());
		assertEquals("Alberto", this.user.getName());
		assertEquals(555555555, this.user.getNumber());
	}

	@Test
	public void testFullName() {
		assertEquals("Alberto Cols", this.user.fullName());
	}

	@Test
	public void testInitials() {
		assertEquals("A.C.", this.user.initials());
	}
}
