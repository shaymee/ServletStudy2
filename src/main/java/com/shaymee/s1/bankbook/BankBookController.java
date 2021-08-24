package com.shaymee.s1.bankbook;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BankBookController {
	
	private BankbookDAO bankbookDAO;
	
	public BankBookController() {
		bankbookDAO = new BankbookDAO();
	}

	public void start(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("== BankBookController 실행 ==");
		System.out.println(request.getPathInfo());
		String path="";
		String uri = request.getRequestURI();
		int index = uri.lastIndexOf("/");
		System.out.println("last index: " +index);
		path = uri.substring(index+1);
		
		if(path.equals("bankbookList.do")) {                     /** Bankbook List */
			System.out.println("상품목록 진행");
			ArrayList<BankbookDTO> ar = bankbookDAO.getList();
			
			RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/bankbook/bankbookList.jsp");
			
			try {
				view.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
//			for(int i=0;i<ar.size();i++) {
//				System.out.println("=====================================");
//				System.out.println(ar.get(i).getBookNumber());
//				System.out.println(ar.get(i).getBookName());
//				System.out.println(ar.get(i).getBookRate());
//				if(ar.get(i).getBookSale() == 1) {
//					System.out.println("판매가능 상품");
//				} else {
//					System.out.println("판매중단 상품");
//				}
			
			//향상된 for문
			//for(모은타입명 변수명:collection참조변수명 or 배열명) // 배열도 가능
			for(BankbookDTO bankbookDTO:ar) {
				System.out.println(bankbookDTO.getBookName());
			}				

		} else if(path.equals("bankbookInsert.do")) {
			System.out.println("상품등록 진행");
			
			
		} else if(path.equals("bankbookSelect.do")) {           /** Bankbook Select */
			System.out.println("상품상세조회 진행");			
			String value = request.getParameter("booknumber");
			long num2= Long.parseLong(value);			
			BankbookDTO bankbookDTO = new BankbookDTO();
			bankbookDTO.setBookNumber(num2);			
			bankbookDTO = bankbookDAO.getSelect(bankbookDTO);			
			System.out.println(bankbookDTO.getBookName());
			
			RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/bankbook/bankbookSelect.jsp"); 
																	  // 인자값로 내가 보여주고싶은 jsp의 경로명을 적어라
																	  // url을 기준으로 현재 위치를 파악해야함
																	  // 이후 서버 내부에서 움직임
			try {
				view.forward(request, response); // request, response는 tomcat에서 만든 내장객체. 둘은 항상 같이 다님
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		} else {
			System.out.println("없는 URL");
		}
		
				
	}
	
	
}
