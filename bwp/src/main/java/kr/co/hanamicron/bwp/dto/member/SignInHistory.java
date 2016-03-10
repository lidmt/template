package kr.co.hanamicron.bwp.dto.member;

import java.util.Date;

import kr.co.hanamicron.bwp.exception.member.RestrictedAccessMember;
import lombok.Data;

@Data
public class SignInHistory {
	private int no;
	private String ipAddress;
	private int fail_count;
	private Date fail_date;
	private Date success_date;

	public void setFail_count(int fail_count) {
		if (fail_count > 4)
			throw new RestrictedAccessMember("비밀번호를 5회 이상 잘못 입력하였습니다. 비밀번호를 변경해주시기 바랍니다.");
	}
}
