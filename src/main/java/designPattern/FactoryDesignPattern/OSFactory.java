package designPattern.FactoryDesignPattern;

public class OSFactory {
	
	public OS getOS(String str){
		if(str.equalsIgnoreCase("open")) 
			return new Android();
		else if(str.equalsIgnoreCase("close")) 
			return new IOS();
		else 
			return new Window();
	}

}
