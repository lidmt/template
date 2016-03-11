package kr.co.hanamicron.bwp.web.controller.menu;

import kr.co.hanamicron.bwp.component.service.menu.AccessMenuDaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MenuController {
	@Autowired AccessMenuDaoService accessMenuService;

	@RequestMapping(value="/menu", method=RequestMethod.GET)
	public String leftMenuPage(Model model) {
		model.addAttribute("menu", accessMenuService.getMenuList());
		return "templates/left_menu";
	}
}
