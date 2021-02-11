package techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job jobOne, jobTwo, firstJob, secondJob, job;

    @Before
    @Test
    public void testSettingJobId(){
        jobOne = new Job();
        jobTwo = new Job();

        assertEquals(1, jobOne.getId());
    }


    @Test
    public void testJobConstructorSetAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        firstJob = new Job("Grocery Clerk", new Employer("Walmart"), new Location("Denver"), new PositionType("Hourly"), new CoreCompetency("Customer Care"));
        secondJob = new Job("Grocery Clerk", new Employer("Walmart"), new Location("Denver"), new PositionType("Hourly"), new CoreCompetency("Customer Care"));

        assertFalse(firstJob == secondJob);
    }

    @Test
    public void jobCustomToString(){
        job = new Job("Seller", new Employer("GameStonk"), new Location("Nevada"), new PositionType("Clerk"), new CoreCompetency("Stonks"));
        String output = "";
        output = "ID: 3\nName: Seller\nEmployer: GameStonk\nLocation: Nevada\nPosition Type: Clerk\nCore Competency: Stonks";
        assertEquals(output, job.toString());
    }






}
