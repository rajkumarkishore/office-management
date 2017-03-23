package oms.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/", "/public/**").permitAll() // by-pass authentication for public urls
				.anyRequest().authenticated().and().formLogin()
				.loginPage("/login") 										// login page url
				.successForwardUrl("/authenticated") 						// login success url
				.failureUrl("/bad-credentials")								// login error url
				.permitAll().and().logout()
				.logoutUrl("/logout")										// logout url
				.logoutSuccessUrl("/")										// redirected url after logout
				.permitAll().and()
				.csrf().disable();											// csrf disabled 
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("password")
				.roles("USER");

	}

}
