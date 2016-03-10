package kr.co.hanamicron.bwp.exception.member;

import org.springframework.security.authentication.BadCredentialsException;

public class RestrictedAccessMember extends BadCredentialsException {
	private static final long serialVersionUID = 206766791334418163L;

	public RestrictedAccessMember(String msg) {
		super(msg);
	}
}
