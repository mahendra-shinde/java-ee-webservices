package com.mahendra.services;

import com.mahendra.exceptions.*;
import javax.ws.rs.*;

import com.mahendra.models.Account;

@Path("/accounts")
public class AccountResource {

	@GET
	public Account find(@QueryParam("accno") int accno)
		throws AccountNotFoundException
	{
		if(accno == 101) {
			return new Account(101,"Rahul Modi","7567576765",12000);
		}
		else {
			throw new AccountNotFoundException(accno);
		}
	}
	
	
}
