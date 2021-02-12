package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String toString(){
        String output = "";
        String doesNotExist = "";

        if (this.getLocation().value.isEmpty() && this.getEmployer().value.isEmpty() && this.getPositionType().value.isEmpty() && this.getName().isEmpty() && this.getCoreCompetency().value.isEmpty()){
            doesNotExist = "OOPS! This job does not seem to exist.";
            return doesNotExist;
        }
        if(this.getEmployer().value.isEmpty() || this.getEmployer().value == null){
            getEmployer().value = "Data not available.";
        }
        if (this.getName().isEmpty() || this.getName() == null) {
            this.setName("Data not available");
        }
        if (this.getCoreCompetency().value.isEmpty() || this.getCoreCompetency().value == null){
            this.getCoreCompetency().value = "Data not available.";
        }
        if (this.getLocation().value.isEmpty() || this.getLocation().value == null){
            this.getLocation().value = "Data not available.";
        }
        if (this.getPositionType().value.isEmpty() || this.getPositionType().value == null){
            this.getPositionType().value = "Data not available.";
        }
        output = "\nID: " + this.id + "\n" + "Name: " + this.getName() + "\n" +"Employer: " + this.getEmployer() +"\n" + "Location: " + this.getLocation() + "\n" + "Position Type: " + this.getPositionType() + "\n" + "Core Competency: " + this.getCoreCompetency() + "\n" ;
        return output;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
