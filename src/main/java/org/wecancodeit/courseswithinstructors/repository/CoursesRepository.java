package org.wecancodeit.courseswithinstructors.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.courseswithinstructors.model.Course;

public interface CoursesRepository extends CrudRepository<Course, Long> {

}
