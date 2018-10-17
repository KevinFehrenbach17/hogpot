package org.wecancodeit.courseswithinstructors.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {

	@Id
	@GeneratedValue

	private Long id;
	private String subject;
	private String cNumber;
	private String room;
	@ManyToOne
	private Instructor instructor;

	public Course(String subject, String cNumber, String room, Instructor instructor) {
		this.subject = subject;
		this.cNumber = cNumber;
		this.room = room;
		this.instructor = instructor;
	}

	public Long getId() {
		return id;
	}

	public String getSubject() {
		return subject;
	}

	public String getcNumber() {
		return cNumber;
	}

	public String getRoom() {
		return room;
	}

	public Instructor getInstructor() {
		return instructor;
	}

}
