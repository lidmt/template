package kr.co.hanamicron.bwp.component.dao.member;

import kr.co.hanamicron.bwp.dto.member.Member;

public interface MemberDao {
	public Member getMemberById(String id);
	public int insertMember(Member member);
}
