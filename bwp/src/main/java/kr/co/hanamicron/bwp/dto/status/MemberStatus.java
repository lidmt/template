package kr.co.hanamicron.bwp.dto.status;

import kr.co.hanamicron.bwp.exception.member.RestrictedAccessMember;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class MemberStatus extends Status{
	private boolean isLock;

	public void isLock(boolean isLock) {
		if(isLock) throw new RestrictedAccessMember("접근이 거부되었습니다. : " + getName());
		this.isLock(isLock);
	}
}