package org.wecancodeit.courseswithinstructors.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.courseswithinstructors.model.Instructor;

public interface InstructorRepository extends CrudRepository<Instructor, Long> {

}
