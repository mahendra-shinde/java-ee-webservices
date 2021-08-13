package com.mahendra;
import java.util.HashSet;
import java.util.Set;

import com.mahendra.services.HelloWorldResource;

// Jakarta WS RS is Package used by Java ee7 onwards
// Older Java-EE uses javax.ws.rs
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
		return singletons;
	}
}
