package kr.co.hanamicron.bwp.dto;

import java.util.List;

import lombok.Data;

@Data
public class Menu {
	private int no;
	private int depth;
	private int sequence;
	private String url;
	private String name;
	private boolean hasView;
	private int parents_no;
	private List<Menu> subMenu;
}
