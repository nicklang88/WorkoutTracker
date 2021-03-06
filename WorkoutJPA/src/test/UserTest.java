package test;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.Account;
import entities.Address;
import entities.User;

public class UserTest {
	  private EntityManagerFactory emf;
	    private EntityManager em;

	    @Before
	    public void setUp() throws Exception {
	        emf = Persistence.createEntityManagerFactory("WorkoutJPA");
	        em = emf.createEntityManager();
	    }

	    @Test
	    public void test() throws ParseException {
	        User user = em.find(User.class, 1);
	        assertEquals((Double)23.08, user.getBmi());
	        assertEquals("nick", user.getFirstName());
	        assertEquals("lang", user.getLastName());
	        assertEquals(27, user.getAge());
	        assertEquals("thisistotallyanemail", user.getEmail());
	      
	        Address a = user.getAddress();
	        assertEquals(1, a.getId());
	        Account acc = user.getAccount();
	        assertEquals(1, acc.getId());
	    }

	    @After
	    public void tearDown() throws Exception {
	        em.close();
	        emf.close();
	    }

}
