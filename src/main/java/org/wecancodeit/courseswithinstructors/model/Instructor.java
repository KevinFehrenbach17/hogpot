package org.wecancodeit.courseswithinstructors.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Instructor {

	@Id
	@GeneratedValue

	private Long id;
	private String fName;
	@OneToMany(mappedBy="instructor")
	private Set<Course> courses;

	public Set<Course> getCourses() {
		return courses;
	}

	public Long getId() {
		return id;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	private String lName;

	public Instructor(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}

	public Instructor() {

	}

}
