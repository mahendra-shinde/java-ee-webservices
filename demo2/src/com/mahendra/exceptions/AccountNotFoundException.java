package com.mahendra.exceptions;

public class AccountNotFoundException extends RuntimeException {

	public AccountNotFoundException(int accNo) {
		super("Account "+accNo+" does not exists!");
	}
}
