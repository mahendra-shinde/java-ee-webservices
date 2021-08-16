package com.mahendra.exceptions;

public class AccountExistsException extends RuntimeException {
	public AccountExistsException(int accNo) {
		super("Account "+accNo+" alreday exists! please try difference account number");
	}
}
