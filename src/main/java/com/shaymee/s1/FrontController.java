package com.shaymee.s1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shaymee.s1.bankbook.BankBookController;
import com.shaymee.s1.member.MemberController;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private MemberController mc;
	private BankBookController bc;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
        mc = new MemberController();
        bc = new BankBookController();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    //오버라이딩이라서 header를 바꾸면 안됨
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Front Controller 실행");
		String uri = request.getRequestURI();
//		String url = request.getRequestURL().toString();
		
		System.out.println("URI :"+uri);
//		System.out.println("URL :"+url);
		
		String path = "";
		//substring
		int startIndex = request.getContextPath().toString().length();
		int lastIndex = uri.lastIndexOf("/");
		path = uri.substring(startIndex, lastIndex);
		System.out.println("path :"+ path);

		if(path.equals("/bankbook")) {			
			bc.start(request, response);
		} else if(path.equals("/member")) {
			try {
				mc.start(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("없는 URL");
		}
		
//		String[] s = uri.split("/");
//		path = s[2];
//		System.out.println("path :"+ path); // bankbook or member
		
//		if(s[2].equals("bankbook")) {			
//			bc.start();
//		} else if(s[2].equals("member")) {
//			mc.start();
//		} else {
//			System.out.println("없는 URL");
//		{
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
