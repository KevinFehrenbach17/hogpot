package org.wecancodeit.courseswithinstructors.hogpop;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.courseswithinstructors.model.Course;
import org.wecancodeit.courseswithinstructors.model.Instructor;
import org.wecancodeit.courseswithinstructors.repository.CoursesRepository;
import org.wecancodeit.courseswithinstructors.repository.InstructorRepository;

@Service
public class HogPop implements CommandLineRunner {

	@Resource
	CoursesRepository coursesRepo;

	@Resource
	InstructorRepository instructorRepo;

	@Override
	public void run(String... args) throws Exception {
		Instructor brian = new Instructor("Brian", "Forscythe");
		instructorRepo.save(brian);
		coursesRepo.save(new Course("Defense Against the Dark Arts", "101", "Room 204", brian));
		coursesRepo.save(new Course("Defense Against the Dark Arts", "201", "Room 204", brian));
		coursesRepo.save(new Course("Secret Office Hours (don't ask about them)", "000", "???", brian));
		Instructor donny = new Instructor("Donny", "Hamiltoniii");
		instructorRepo.save(donny);
		coursesRepo.save(new Course("Herbology", "101", "Greenhouse", donny));
		coursesRepo.save(new Course("Potions", "101", "Dungeons", donny));
		Instructor alan = new Instructor("Alan", "Koustrick");
		instructorRepo.save(alan);
		coursesRepo.save(new Course("Quiddich", "101", "Quiddich Pitch", alan));
		coursesRepo.save(new Course("Transfiguration", "101", "Room 112", alan));

	}
}
