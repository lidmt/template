package kr.co.hanamicron.bwp.component.service.member;

import kr.co.hanamicron.bwp.dto.member.Member;

public interface MemberSignInService {
	public Member signIn(String id, String password);
}
