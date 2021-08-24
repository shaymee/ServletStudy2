package com.shaymee.s1.member;

import javax.servlet.http.HttpServletRequest;

public class MemberController { //servlet이 아니고 일반 class임
	
	public void start(HttpServletRequest request) {
		System.out.println("== MemberController 실행 ==");
		String path="";
//		String[] s = request.getRequestURI().split("/");
//		path = s[3];
		
		String uri = request.getRequestURI();
		int index = uri.lastIndexOf("/");
		path = uri.substring(index+1);
		
		
		if(path.equals("memberLogin.do")) {	
		String value = request.getParameter("id");
		System.out.println(value);
		String value2 = request.getParameter("pw");
		System.out.println(value2);
			System.out.println("로그인 진행");			
		} else if(path.equals("memberJoin.do")) {			
			System.out.println("회원가입 진행");			
		} else if(path.equals("memberPage.do")) {			
			System.out.println("마이페이지 진행");			
		} else {
			System.out.println("없는 URL");
		}
		
	}
	
	
}
