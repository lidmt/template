package kr.co.hanamicron.bwp.core.security.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.hanamicron.bwp.component.dao.member.SignInHistoryDao;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;


public class SignInSuccessHander extends SavedRequestAwareAuthenticationSuccessHandler{
	@Autowired SignInHistoryDao signInHistoryDao;

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException,	ServletException {
		String accept = request.getHeader("accept");

		if(StringUtils.indexOf(accept,"html") > -1) {
			super.onAuthenticationSuccess(request, response, authentication);
		} else if (StringUtils.indexOf(accept, "json") > -1){
			response.setContentType("application/json");
			response.setCharacterEncoding("utf-8");
		}
	}
}
