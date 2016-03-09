package kr.co.hanamicron.bwp.web.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberSignInController {

	@RequestMapping(value="/member/signin", method=RequestMethod.GET)
	public String signInPage() {
		return "member/signin";
	}
}
