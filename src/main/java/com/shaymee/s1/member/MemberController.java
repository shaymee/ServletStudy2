package com.shaymee.s1.member;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberController { //servlet이 아니고 일반 class임
	
	private MemberService memberService;
	
	public MemberController() {
		memberService = new MemberService();
	}
	public void start(HttpServletRequest request, HttpServletResponse response) throws Exception {
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
			
			String method = request.getMethod();
			System.out.println(method);
			System.out.println(request.getParameter("id"));
			
			if(method.equals("POST")) { //post가 맞으면 회원가입 java코드로?
				int result = memberService.memberJoin(request, response);
				if(result>0) {
					response.sendRedirect("../"); // index로 가는 경로
				} else {
					response.sendRedirect("./memberJoin.do"); // ./ --> 현재 위치라는 뜻
															  //forward도 가능하다니 다시 생각해봐
				}
				
				
			} else { // post가 아니면 jsp로 이동하는 코드를 써준다
				RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/member/memberJoin.jsp");
				view.forward(request, response);
			}
			} else if(path.equals("memberPage.do")) {			
			System.out.println("마이페이지 진행");			
		} else {
			System.out.println("없는 URL");
		}
		
		}
	
	
	}
