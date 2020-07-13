package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required")
    @Size(min = 3, max = 75, message = "Location must be between 3 and 75 characters")
    private String location;

    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

    public Employer(){}

    public Employer(@Valid String location, List<Job> jobs) {
        super();
        this.location = location;
        this.jobs = jobs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
