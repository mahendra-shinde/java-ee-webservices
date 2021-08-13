package com.mahendra.services;

import com.mahendra.models.Customer;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import java.util.*;



@Path("/customer")
public class CustomerResource {

	private List<Customer>  customerList = new LinkedList<Customer>();
	
	public CustomerResource() {
		Customer c1 =  new Customer(1,"Rajiv","Bhatia","akki@yahoo.co.in");
		Customer c2 =  new Customer(2,"Laxmikant","Berde","laxya@yahoo.co.in");
		customerList.add(c1);
		customerList.add(c2);
	}
	
	
	@GET
	@Path("/{id}") // Resulting Path Suffix customer/{id}
	@Produces({"application/json","application/xml"})
	public Response find(@PathParam("id")int id) {
		for(Customer c : customerList) {
			if(c.getId() == id) {
				System.out.println("Found :"+c.getFirstName());
				return Response.ok(c).build();
			}
		}
		return Response.status(404).entity("Customer "+id+" not found").build();
	}
	
	@POST
	@Consumes("application/json")
	public Customer create(Customer customer) {
		int newId = customerList.size()+1;
		customer.setId(newId);
		customerList.add(customer);
		return customer;
	}
	
	@GET
	@Produces({"application/json","application/xml"})
	public List<Customer> findAll(){
		//returns a READONLY copy of List
		return Collections.unmodifiableList(customerList);
	}
}
