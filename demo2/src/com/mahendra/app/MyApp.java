package com.mahendra.app;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api")
public class MyApp extends ResourceConfig {

	public MyApp() {
		packages("com.mahendra.services");
	}
}
