package kr.co.hanamicron.bwp.exception.member;

import org.springframework.security.authentication.BadCredentialsException;

public class MemberNotFoundException extends BadCredentialsException{

	private static final long serialVersionUID = -8247220967844224822L;

	public MemberNotFoundException(String msg) {
		super(msg);
	}
}
