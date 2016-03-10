package kr.co.hanamicron.bwp.component.dao.status;

import kr.co.hanamicron.bwp.dto.status.Status;

public interface StatusDao {
	public Status getMemberStatusByMemberNo(int no);
}
