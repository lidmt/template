package kr.co.hanamicron.bwp.component.dao.status;

import kr.co.hanamicron.bwp.dto.status.MemberStatus;

public interface MemberStatusDao {
	public MemberStatus getMemberStatusByMemberNo(int no);
}
