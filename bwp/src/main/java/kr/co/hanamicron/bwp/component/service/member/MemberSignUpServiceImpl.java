package kr.co.hanamicron.bwp.component.service.member;

import kr.co.hanamicron.bwp.component.dao.member.MemberDao;
import kr.co.hanamicron.bwp.component.dao.role.MemberRoleDao;
import kr.co.hanamicron.bwp.dto.member.Member;
import kr.co.hanamicron.bwp.dto.member.MemberRole;
import kr.co.hanamicron.bwp.dto.member.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberSignUpServiceImpl implements MemberSignUpService{
	@Autowired PasswordEncoder passwordEncoder;
	@Autowired MemberDao memberDao;
	@Autowired MemberRoleDao memberRoleDao;

	@Transactional
	@Override
	public boolean signUp(Member member) {
		member.setPassword(passwordEncoder.encode(member.getPassword()));
		if(memberDao.insertMember(member) != 0){
			MemberRole memberRole = new MemberRole(member, new Role(1, "NEW_USER"));
			memberRoleDao.insertMemberRole(memberRole);
			return true;
		}
		return false;
	}

}
