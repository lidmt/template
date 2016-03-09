package kr.co.hanamicron.bwp.web.controller.member;

import kr.co.hanamicron.bwp.dto.member.Member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberSignUpController {

	@RequestMapping(value="/member/signup", method=RequestMethod.GET)
	public String signUpView(@ModelAttribute("member")Member member) {
		return "member/signup.tiles";
	}

	@RequestMapping(value="/member/signup", method=RequestMethod.PUT)
	public String signUpMember(@ModelAttribute("member")Member member) {
		return "member/signup/success";
	}
}
