package kr.co.hanamicron.bwp.component.dao.member;

import kr.co.hanamicron.bwp.dto.member.Member;
import kr.co.hanamicron.bwp.dto.member.SignInHistory;

public interface SignInHistoryDao {
	public SignInHistory getSignInHistoryByMemberNo(int member_no);
	public int updateSignInSuccessHistory(Member member);
	public int updateSignInFailHistory(Member member);
}
