package designPattern.PrototypeDesignPatern;

import java.util.ArrayList;

public class Book {
	
	private String bookName;
	private int bookID;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookID=" + bookID + "]";
	
	}
}
