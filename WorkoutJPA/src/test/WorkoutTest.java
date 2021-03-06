package test;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.Workout;
import entities.WorkoutDefinition;

public class WorkoutTest {
	  private EntityManagerFactory emf;
	    private EntityManager em;

	    @Before
	    public void setUp() throws Exception {
	        emf = Persistence.createEntityManagerFactory("WorkoutJPA");
	        em = emf.createEntityManager();
	    }

	    @Test
	    public void test() throws ParseException {
	        Workout workout = em.find(Workout.class, 1);
	        assertEquals(1, workout.getId());
	        assertEquals("Strength", workout.getName());
	        assertEquals(null, workout.getDescription());
	    
	        List<WorkoutDefinition> ws = workout.getWorkoutDefinitions();
	        assertEquals(23, ws.size());

	        
	      
	    }

	    @After
	    public void tearDown() throws Exception {
	        em.close();
	        emf.close();
	    }

}
