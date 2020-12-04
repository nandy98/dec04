package designPattern.BuilderPattern;

public class BuilderPatternMain {

	public static void main(String[] args) {

		Phone p = new Phone(12, 20, 12210, "qpn", "sdfsdfh");
		System.out.println(p);

		System.out.println("--------------");
		  BuilderPattern ph = new BuilderPattern().setScreenSize(3000).setRam(3003).setProcessor("apple");
		 Phone p1 = ph.getPhone();
		 System.out.println(p1);
	}

}
