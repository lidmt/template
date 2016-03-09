package kr.co.hanamicron.bwp.dto.status;

import java.util.Date;

import kr.co.hanamicron.bwp.dto.member.Member;
import lombok.Data;

@Data
public class Status {
	private int no;
	private String name;
	private Member updator;
	private Member creator;
	private Date create_date;
	private Date update_date;
}