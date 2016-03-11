package kr.co.hanamicron.bwp.dto.member;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberRole {
	private Member member;
	private Role role;

	public MemberRole(Member member, Role role) {
		this.member = member;
		this.role = role;
	}
}
