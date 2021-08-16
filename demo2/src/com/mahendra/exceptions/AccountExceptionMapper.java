package com.mahendra.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider 
public class AccountExceptionMapper implements ExceptionMapper<RuntimeException> {

	@Override
	public Response toResponse(RuntimeException exception) {
		System.out.println("Handling an Exception: "+exception.getMessage());
		return Response.status(404).entity(exception.getMessage()).build();
	}
}
