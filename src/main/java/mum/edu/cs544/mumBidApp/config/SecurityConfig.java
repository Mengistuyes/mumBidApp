package mum.edu.cs544.mumBidApp.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	  /*auth.inMemoryAuthentication().withUser("mkyong").password("123456").roles("ROLE_USER");*/
	  auth.inMemoryAuthentication().withUser("admin@mum.edu").password("12345678").roles("ADMIN");
	/*  auth.inMemoryAuthentication().withUser("dba").password("123456").roles("DBA");*/
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	  http.authorizeRequests()
		.antMatchers("/admin/**").access("hasRole('ADMIN')")
		.antMatchers("/dba/**").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_DBA')")
		.and().formLogin();
	}
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
	auth.jdbcAuthentication().dataSource(dataSource)
	.usersByUsernameQuery(
	"select eMail, password from user where eMail=?")
	.authoritiesByUsernameQuery(
	"select username, role from user_roles where username=?");
	} 
}