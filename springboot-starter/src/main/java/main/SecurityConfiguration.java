package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired
	UserDetailsService userDetailService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication()
//		.withUser("win")
//		.password("pass")
//		.roles("ADMIN")
//		.and()
//		.withUser("si")
//		.password("pass")
//		.roles("USER");
		auth.userDetailsService(userDetailService);
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/details").hasAnyRole("USER", "ADMIN")
		.antMatchers("/topics").permitAll()
		.antMatchers("/").permitAll()
		.and().formLogin()
		.and()
        .logout()
            .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))            
            .logoutSuccessUrl("/login")
            .invalidateHttpSession(true)        
            .deleteCookies("JSESSIONID")        
            .and()
        .exceptionHandling()
            .accessDeniedPage("/403");
	}

	
}