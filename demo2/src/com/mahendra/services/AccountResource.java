package com.mahendra.services;

import com.mahendra.exceptions.*;

import javax.security.auth.login.AccountException;
import javax.ws.rs.*;

import com.mahendra.models.Account;

@Path("/accounts")
@Produces({"application/json","text/plain"})
@Consumes("application/json")
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
	
	@POST
	public Account create(Account account)throws AccountExistsException {
		if(account.getAccNo()==101) {
			throw new AccountExistsException(101);
		}
		else {
			return account;
		}
	}
}
