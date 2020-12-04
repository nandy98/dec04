package designPattern.PrototypeDesignPatern;

import java.util.ArrayList;

public class BookShop implements Cloneable{
	private String bookShopName;
	private ArrayList<Book> Books = new ArrayList<Book>();
	
	public ArrayList<Book> getBooks() {
		return Books;
	}

	public void setBooks(ArrayList<Book> books) {
		Books = books;
	}
	
	public String getBookShopName() {
		return bookShopName;
	}

	public void setBookShopName(String bookShopName) {
		this.bookShopName = bookShopName;
	}

	@Override
	public String toString() {
		return "BookShop [bookShopName=" + bookShopName + ", Books=" + Books + "]";
	}

	public void getBookData() {
		for(int i=1;i<=10;i++) {
			Book b = new Book();
			b.setBookID(i);
			b.setBookName("Book"+i);
			getBooks().add(b);
		}
	}

	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		BookShop shop = new BookShop();
		for(Book b : this.getBooks()) {
			shop.getBooks().add(b);
		}
		return shop;
	}


}
