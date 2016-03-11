package kr.co.hanamicron.bwp.component.service.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.co.hanamicron.bwp.component.dao.menu.AccessMenuDao;
import kr.co.hanamicron.bwp.core.security.util.SessionManager;
import kr.co.hanamicron.bwp.dto.Menu;
import kr.co.hanamicron.bwp.dto.member.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessMenuServiceImpl implements AccessMenuDaoService {
	@Autowired AccessMenuDao accessMenuDao;

	@Override
	public List<Menu> getMenuList() {
		Member member = SessionManager.getMember();

		List<Menu> list = accessMenuDao.getAccessMenuListByMemberNo(member.getNo());
		Map<Integer, List<Menu>> map = new HashMap<Integer, List<Menu>>();

		for(int i = 1; i <= 3; i++) {
			List<Menu> temp = new ArrayList<Menu>();
			for(Menu menu : list) {
				if(i == menu.getDepth()) temp.add(menu);
			}
			map.put(i, temp);
			if(i > 1) {
				for(Menu parents : map.get(i-1)) {
					List<Menu> subMenu = new ArrayList<Menu>();
					for(Menu menu : temp) {
						if(parents.getNo() == menu.getParents_no()) subMenu.add(menu);
					}
					parents.setSubMenu(subMenu);
				}
			}
		}
		return map.get(1);
	}
}
