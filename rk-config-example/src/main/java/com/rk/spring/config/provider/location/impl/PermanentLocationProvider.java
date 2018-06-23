package com.rk.spring.config.provider.location.impl;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.rk.spring.config.provider.location.LocationProvider;

@Component
@ConditionalOnProperty(name="myapp.location", havingValue="permanent")
public class PermanentLocationProvider implements LocationProvider {

	@Override
	public String getLocation() {
		return "Kolkata";
	}
}
