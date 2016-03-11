package kr.co.hanamicron.bwp.web.controller.member;

import kr.co.hanamicron.bwp.component.service.member.MemberSignUpService;
import kr.co.hanamicron.bwp.dto.member.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberSignUpController {
	@Autowired MemberSignUpService memberSignUpService;

	@RequestMapping(value="/member/signup", method=RequestMethod.GET)
	public String signUpView(@ModelAttribute("member")Member member) {
		if(member == null) member = new Member();
		return "member/signup";
	}

	@RequestMapping(value="/member/signup", method=RequestMethod.PUT)
	public String signUpMember(@ModelAttribute("member")Member member) {
		if(memberSignUpService.signUp(member)) {
			return "dashboard/dashboard.tiles";
		}
		return "member/signup_fail";
	}

	@RequestMapping(value="/member/signup/success")
	public String signUpSuccess() {
		return "redrect:/";
	}
}
