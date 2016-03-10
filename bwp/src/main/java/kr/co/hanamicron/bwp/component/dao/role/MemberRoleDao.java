package kr.co.hanamicron.bwp.component.dao.role;

import java.util.List;

import kr.co.hanamicron.bwp.dto.member.Member;
import kr.co.hanamicron.bwp.dto.member.Role;

public interface MemberRoleDao {
	public List<Role> getMemberRolesByMemberNo(int member_no);
	public int insertMemberRole(Member member);
}
