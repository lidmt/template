package kr.co.hanamicron.bwp.core.security.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.hanamicron.bwp.component.dao.member.SignInHistoryDao;
import kr.co.hanamicron.bwp.web.util.CheckAjaxSubmit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

public class SignInFailHander implements AuthenticationFailureHandler{
	@Autowired SignInHistoryDao signInHistoryDao;

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
		response.setCharacterEncoding("utf-8");
		request.setAttribute("message", exception.getMessage());

		if(!CheckAjaxSubmit.isAjaxRequest(request)) {
			request.getRequestDispatcher("/member/signin").forward(request, response);
		} else {
			response.sendError(600);
		}
	}
}
