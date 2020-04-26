package main.details;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;

//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import main.course.Course;

@Entity 
@Table(name="students")
public class User {
@Id
@Column
@GeneratedValue(strategy = GenerationType.AUTO)
private int studentid;
@Column
private String firstname;
//@Column
//private String lastName;
//@Column
//private String birthdate;
@Column(name = "blah")
private String username;
@Column
private String password;
@Column
private String roles = "";
//private List<Course> courses;




public User(int studentid, String firstname, String username, String password, String roles) {
	super();
	this.studentid = studentid;
	this.username = username;
	this.password = password;
	this.roles = roles;
}
public User() {}

public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
//public String getLastname() {
//	return lastName;
//}
//public void setLastname(String lastName) {
//	this.lastName = lastName;
//}
//public String getBirthdate() {
//	return birthdate;
//}
//public void setBirthdate(String birthdate) {
//	this.birthdate = birthdate;
//}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public String getRoles() {
	return roles;
}
public void setRoles(String roles) {
	this.roles = roles;
}

//public List<String> getRoleList() {
//	if( this.roles.length() > 0) {
//		return Arrays.asList(this.roles.split(","));
//	}
//	return new ArrayList<>();
//}
//public List<Course> getCourses() {
//	return courses;
//}
//public void setCourses(List<Course> courses) {
//	this.courses = courses;
//}


}
