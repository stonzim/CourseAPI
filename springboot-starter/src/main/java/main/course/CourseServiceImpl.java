package main.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Transactional
	public List<Course> getAllCourses(int topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses; 
	}
	
	@Transactional
	public Course getCourse(int id) {
		return courseRepository.findOne(id);
	}
	
	@Transactional
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	@Transactional
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	@Transactional
	public void deleteCourse(int id) {
		courseRepository.delete(id);
	}
}
