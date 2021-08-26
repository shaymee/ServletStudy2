package com.shaymee.s1.test;

import java.sql.Connection;

import com.shaymee.s1.bankbook.BankbookDAO;
import com.shaymee.s1.bankbook.BankbookDTO;
import com.shaymee.s1.util.DBConnector;

public class DBTest {

	public static void main(String[] args) {
		// TEST 용도
		BankbookDAO bankbookDAO = new BankbookDAO();
		BankbookDTO bankbookDTO = new BankbookDTO();
		
//		bankbookDTO.setBookName();
//		bankbookDAO.setInsert()
		
//		DBConnector dbConnector = new DBConnector();
//		Connection con = null;
//		
//		try {
//			con = dbConnector.getConnect();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(con);
//		
//		//BankbookDAO getSelect Test

//		bankbookDTO.setBookNumber(1000);
//		bankbookDTO = bankbookDAO.getSelect(bankbookDTO);
//		
//		System.out.println(bankbookDTO.getBookName());
		
	}

}
