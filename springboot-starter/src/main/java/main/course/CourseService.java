package main.course;

import java.util.List;

public interface CourseService {

	public List<Course> getAllCourses(int topicId);
	
	public Course getCourse(int id);
	
	public void addCourse(Course course);
	
	public void updateCourse(Course course);
	
	public void deleteCourse(int id);
}
