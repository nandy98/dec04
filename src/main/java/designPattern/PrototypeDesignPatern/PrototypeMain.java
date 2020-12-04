package designPattern.PrototypeDesignPatern;

public class PrototypeMain {

	public static void main(String args[]) throws CloneNotSupportedException {
		/*
		 *shallow cloning : data will be removed from cloned object as well
		 * 
		 * BookShop bs = new BookShop();
		bs.setBookShopName("my book store");
		bs.getBookData();
		bs.getBooks().remove(2);
		System.out.println(bs);
		
		 BookShop bs1 = (BookShop) bs.clone();
		 bs1.setBookShopName("MyBookStore");
		 System.out.println(bs1);*/
		
		//deep cloning
		
		BookShop bs = new BookShop();
		bs.setBookShopName("my book store");
		bs.getBookData();
		System.out.println(bs);
		
		 BookShop bs1 = (BookShop) bs.clone();
		 bs.getBooks().remove(2);
		 bs1.setBookShopName("MyBookStore");
		 System.out.println(bs1);
	}
}
