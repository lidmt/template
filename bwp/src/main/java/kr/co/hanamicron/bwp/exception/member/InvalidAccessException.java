package kr.co.hanamicron.bwp.exception.member;

import org.springframework.security.authentication.BadCredentialsException;

public class InvalidAccessException extends BadCredentialsException {

	private static final long serialVersionUID = -1636859401151698640L;

	public InvalidAccessException(String msg) {
		super(msg);
	}
}
