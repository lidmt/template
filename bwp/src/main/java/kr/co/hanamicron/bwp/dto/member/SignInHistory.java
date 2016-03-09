package kr.co.hanamicron.bwp.dto.member;

import java.util.Date;

import lombok.Data;

@Data
public class SignInHistory {
	private int no;
	private String ipAddress;
	private int fail_count;
	private Date fail_date;
	private Date success_date;
}
