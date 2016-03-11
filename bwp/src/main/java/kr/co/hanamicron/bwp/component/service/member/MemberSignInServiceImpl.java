package kr.co.hanamicron.bwp.component.service.member;

import kr.co.hanamicron.bwp.component.dao.member.MemberDao;
import kr.co.hanamicron.bwp.component.dao.member.SignInHistoryDao;
import kr.co.hanamicron.bwp.component.dao.role.MemberRoleDao;
import kr.co.hanamicron.bwp.component.dao.status.MemberStatusDao;
import kr.co.hanamicron.bwp.dto.member.Member;
import kr.co.hanamicron.bwp.exception.member.InvalidAccessException;
import kr.co.hanamicron.bwp.exception.member.MemberNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberSignInServiceImpl implements MemberSignInService {
	@Autowired MemberDao memberDao;
	@Autowired SignInHistoryDao signInHistoryDao;
	@Autowired MemberStatusDao memberStatusDao;
	@Autowired MemberRoleDao memberRoleDao;
	@Autowired PasswordEncoder passwordEncoder;

	@Transactional(readOnly = true)
	@Override
	public Member signIn(String id, String password) {
		Member member = memberDao.getMemberById(id);
		System.out.println("------------------------------- kekt ==================================");
		if (member == null) {
			throw new MemberNotFoundException("존재하지 않는 아이디입니다.");
		} else if (!matchPassword(password, member.getPassword())) {
			throw new InvalidAccessException("아이디 혹은 비밀번호를 잘못입력하셨습니다.");
		}

		member.setHistory(signInHistoryDao.getSignInHistoryByMemberNo(member.getNo()));
		member.setStatus(memberStatusDao.getMemberStatusByMemberNo(member.getNo()));
		member.setRoles(memberRoleDao.getMemberRolesByMemberNo(member.getNo()));
		return member;
	}

	private boolean matchPassword(String inputPassword, String memberPassword) {
		return passwordEncoder.matches(inputPassword, memberPassword);
	}
}
