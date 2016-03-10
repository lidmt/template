package kr.co.hanamicron.bwp.component.service.member;

import kr.co.hanamicron.bwp.component.dao.member.MemberDao;
import kr.co.hanamicron.bwp.component.dao.role.RoleDao;
import kr.co.hanamicron.bwp.dto.member.Member;
import kr.co.hanamicron.bwp.dto.member.MemberRole;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberSignUpServiceImpl implements MemberSignUpService{
	@Autowired PasswordEncoder passwordEncoder;
	@Autowired MemberDao memberDao;
	@Autowired RoleDao roleDao;

	@Transactional
	@Override
	public boolean signUp(Member member) {
		member.setPassword(passwordEncoder.encode(member.getPassword()));
		if(memberDao.insertMember(member) != 0){
			MemberRole memberRole = new MemberRole();
			return true;
		}
		return false;
	}

}
