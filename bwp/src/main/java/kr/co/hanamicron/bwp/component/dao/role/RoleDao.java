package kr.co.hanamicron.bwp.component.dao.role;

import java.util.List;

import kr.co.hanamicron.bwp.dto.member.Member;
import kr.co.hanamicron.bwp.dto.member.Role;

public interface RoleDao {
	public List<Role> getRolesByMemeberNo(int no);
	public int insertMemberRole(Member member);
}
