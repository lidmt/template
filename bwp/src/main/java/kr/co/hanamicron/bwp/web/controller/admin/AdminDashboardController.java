package kr.co.hanamicron.bwp.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminDashboardController {

	@RequestMapping(value="/admin/dashboard", method=RequestMethod.GET)
	public String adminDashboardPage(){
		return "dashboard/dashboard.tiles";
	}
}
