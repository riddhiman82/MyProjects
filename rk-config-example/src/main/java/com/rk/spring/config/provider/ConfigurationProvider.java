package com.rk.spring.config.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.rk.spring.config.provider.location.LocationProvider;

@Configuration
@EnableConfigurationProperties
@PropertySource(value="classpath:my-configuration-prop.properties")
public class ConfigurationProvider {
	
	@Value("${fname}")
	private String firstName; 
	
	@Value("${lname}")
	private String lastName;
	
	//Enable this and remove all constructor
//	@Autowired
	private LocationProvider locationProvider;
	
	public ConfigurationProvider() {
		//Do nothing
	}
	
	//This autowired is needed in case of multiple constructor.
	@Autowired
	public ConfigurationProvider(LocationProvider locationProvider) {
		this.locationProvider = locationProvider;
	}
	
	@Bean
	public String firstName() {
		return firstName; 
	}
	
	@Bean
	public String lastName() {
		return lastName;
	}
	
	@Bean
	public String location() {
		return locationProvider.getLocation();
	}
}
