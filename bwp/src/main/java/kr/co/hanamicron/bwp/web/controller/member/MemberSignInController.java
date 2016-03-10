package kr.co.hanamicron.bwp.web.controller.member;

import kr.co.hanamicron.bwp.dto.member.Member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberSignInController {

	@RequestMapping(value="/member/signin", method=RequestMethod.GET)
	public String signInPage(@ModelAttribute("member") Member member) {
		if(member == null) member = new Member();
		return "member/signin";
	}
}
