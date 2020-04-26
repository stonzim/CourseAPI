package main.details;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
//import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javassist.expr.NewArray;

//import main.course.Course;

@SuppressWarnings("serial")
public class MyUserDetails implements UserDetails{
	
	private int studentid;
	private String username;
	private String firstname;
	private String lastname;
	private String password;
//	private String birthdate;
	private List <GrantedAuthority> authorities;
//	private List<Course> courses;
	
	public MyUserDetails(User user) {
		this.studentid = user.getStudentid();
		this.username = user.getUsername();
		this.firstname = user.getFirstname();
		this.lastname = user.getLastname();
		this.password = user.getPassword();
//		this.birthdate = user.getBirthdate();
//		this.courses = user.getCourses();
		this.authorities = Arrays.stream(user.getRoles().split(","))
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());
		
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}
	public int getStudentid() {
		return studentid;
	}
	public String getFirstName() {
		return firstname;
	}
	public String getLastName() {
		return lastname;
	}
//	public String getBirthdate() {
//		return birthdate;
//	}
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	 
	
}
