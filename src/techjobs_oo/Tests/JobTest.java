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
        Employer e = new Employer("Potato");
        Employer eTwo = new Employer("Alien");

        assertEquals(1, jobTwo.getId() - jobOne.getId());
        assertEquals(1, eTwo.getId() - e.getId());
        assertEquals("Alien", eTwo.getValue());
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
        output = "\nID: 10\nName: Seller\nEmployer: GameStonk\nLocation: Nevada\nPosition Type: Clerk\nCore Competency: Stonks\n";
        assertEquals(output, job.toString());
    }






}
