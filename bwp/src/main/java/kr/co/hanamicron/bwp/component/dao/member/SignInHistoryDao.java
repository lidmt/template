package kr.co.hanamicron.bwp.component.dao.member;

import kr.co.hanamicron.bwp.dto.member.SignInHistory;

public interface SignInHistoryDao {
	public SignInHistory getSignInHistoryByMemberNo(int no);
}
