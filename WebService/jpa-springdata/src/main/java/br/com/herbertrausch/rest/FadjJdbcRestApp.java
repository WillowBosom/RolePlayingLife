package br.com.herbertrausch.rest;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Application;

import org.springframework.stereotype.Component;

@Component
public class FadjJdbcRestApp extends Application {


	@Override
	public Map<String, Object> getProperties() {
		Map<String, Object> properties = new HashMap<>();
		properties
				.put("jersey.config.server.provider.packages", "br.com.herbertrausch");
		return properties;
	}
}
