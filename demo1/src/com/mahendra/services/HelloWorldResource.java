package com.mahendra.services;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;


// A REST RESOURCE ENDPOINT 
// URL FOR THIS APPLICATION: http://localhost:8080/demo1
// URL MAPPING FOR APPLICATIONPATH ? /api
// URL MAPPING FOR THIS RESOURCE /hello
// RESULTING FULL URL : <Application-root-context>/<AppPath>/<SUFFIX>
//    http://localhost:8080/demo1/api/hello
@Path("/hello") //SUFFIX
public class HelloWorldResource {

	@GET
	@Produces("text/plain")
	public String helloText() {
		return "Hello World";
	}
	
	@GET
	@Produces("application/xml")
	public String helloXml() {
		return "<msg>Hello World</msg>";
	}
	
	@GET
	@Produces("application/json")
	public String helloJSON() {
		return "{'msg':'Hello World'}";
	}
}
