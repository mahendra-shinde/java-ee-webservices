package com.mahendra;
import java.util.HashSet;
import java.util.Set;

import com.mahendra.services.CustomerResource;
import com.mahendra.services.HelloWorldResource;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class MyApp extends Application{
	
	public MyApp() {
	
	}
	
	@Override
	public Set<Object> getSingletons() {
		//No more than ONE copy of REST Resource would be used by application.
		HashSet<Object> singletons = new HashSet<>();
		singletons.add(new HelloWorldResource());
		singletons.add(new CustomerResource());
		return singletons;
	}
}
