package kr.co.hanamicron.bwp.core.security.util;

import kr.co.hanamicron.bwp.core.security.exception.CustomAuthenticationException;
import kr.co.hanamicron.bwp.dto.member.Member;

import org.springframework.security.core.context.SecurityContextHolder;

public class SessionManager {

	public static Member getMember(){
		Object object = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Member member = null;
		if(object instanceof Member) {
			member = (Member) object;
		} else {
			throw new CustomAuthenticationException("Not found session");
		}
		return member;
	}
}