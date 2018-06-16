package com.rk.spring.endpoint;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

@Component
public class TestCustomEndpoint implements Endpoint<List<String>>{

	@Override
	public String getId() {
		return "myEndpoint";
	}

	@Override
	public List<String> invoke() {
		return Arrays.asList("Date & Time now :: " + Calendar.getInstance().getTime(), "Provided By Riddhiman");
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isSensitive() {
		return false;
	}

}
