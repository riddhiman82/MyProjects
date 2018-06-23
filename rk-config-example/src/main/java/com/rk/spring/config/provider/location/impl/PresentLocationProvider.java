package com.rk.spring.config.provider.location.impl;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.rk.spring.config.provider.location.LocationProvider;

@Component
@ConditionalOnProperty(name="myapp.location", havingValue="present")
public class PresentLocationProvider implements LocationProvider {
	@Override
	public String getLocation() {
		return "Bangalore";
	}

}
