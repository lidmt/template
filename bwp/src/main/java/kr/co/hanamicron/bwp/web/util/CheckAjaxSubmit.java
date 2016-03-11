package kr.co.hanamicron.bwp.web.util;

import javax.servlet.http.HttpServletRequest;

public class CheckAjaxSubmit {
	public static boolean isAjaxRequest(HttpServletRequest request) {
		String ajaxHeader = request.getHeader("AJAX");
		return request.getHeader(ajaxHeader) != null && request.getHeader(ajaxHeader).equals(Boolean.TRUE.toString());
	}
}
