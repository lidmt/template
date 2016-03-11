package kr.co.hanamicron.bwp.dto.member;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Role {
	private int no;
	private String name;

	public Role(int no, String name) {
		this.no = no;
		this.name = name;
	}
}