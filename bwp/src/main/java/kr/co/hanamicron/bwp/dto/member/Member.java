package kr.co.hanamicron.bwp.dto.member;

import java.util.List;

import kr.co.hanamicron.bwp.dto.status.MemberStatus;
import lombok.Data;

@Data
public class Member {
	private int no;
	private String id;
	private String password;
	private String name;
	private String email;
	private String cellphone;
	private List<Role> roles;
	private SignInHistory history;
	private MemberStatus status;
}
