package com.shaymee.s1.bankbook;

public class BankbookDTO {

	//규칙: 멤버변수 TABLE 컬럼과 같은 이름, 같은 데이터타입
	//접근지정자는 private
	
	//setter,getter 생성
	
	//생성자는 무조건 기본생성자는 하나 있어야함
	
	private long bookNumber;
	private String bookName;
	private double bookRate;
	private int bookSale;
	
	
	public long getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(long bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookRate() {
		return bookRate;
	}
	public void setBookRate(double bookRate) {
		this.bookRate = bookRate;
	}
	public int getBookSale() {
		return bookSale;
	}
	public void setBookSale(int bookSale) {
		this.bookSale = bookSale;
	}

	
	
	
	
	
}
