package com.cg.Lib.entities;

import org.springframework.context.annotation.Bean;

public class RestTemplate {
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}

