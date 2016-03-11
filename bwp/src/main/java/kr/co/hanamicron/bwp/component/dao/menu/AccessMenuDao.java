package kr.co.hanamicron.bwp.component.dao.menu;

import java.util.List;

import kr.co.hanamicron.bwp.dto.Menu;

public interface AccessMenuDao {
	public List<Menu> getAccessMenuListByMemberNo(int member_no);
}
