package kr.co.hanamicron.bwp.core.security;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import kr.co.hanamicron.bwp.component.service.member.MemberSignInService;
import kr.co.hanamicron.bwp.dto.member.Member;
import kr.co.hanamicron.bwp.dto.member.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class CustomAuthenticationProvider implements AuthenticationProvider{
	@Autowired MemberSignInService memberSignInService;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		Member member = memberSignInService.signIn(authentication.getName(), (String)authentication.getCredentials());

		return new UsernamePasswordAuthenticationToken(member, null, getGrantedAuthorities(member));
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}

	private List<GrantedAuthority> getGrantedAuthorities(Member member) {
		if(member.getRoles() == null) {
			return Collections.emptyList();
		}

		List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
		for(Role role : member.getRoles()) {
			grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
		}

		return grantedAuthorities;
	}
}
