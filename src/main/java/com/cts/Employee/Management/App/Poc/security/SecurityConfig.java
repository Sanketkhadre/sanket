package com.cts.Employee.Management.App.Poc.security;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
public class SecurityConfig {
	
	public static final String[] PUBLIC_URLS={
		"/api/v1/auth/**",
		"/v3/api-docs",
		"/v2/api-docs",
		"/swagger-resources/**",
		"/swagger-ui/**",
		"/webjars/**"
	};

}
