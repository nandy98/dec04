package behavioralPattern.Observerpattern1;

public class Youtube {

	public static void main(String[] args) {
		Channel ourIndia= new Channel(); 
		
		Subscriber s1 = new Subscriber("sub1");
		Subscriber s2 = new Subscriber("sub2");
		Subscriber s3 = new Subscriber("sub3");
		Subscriber s4 = new Subscriber("sub4");
		Subscriber s5 = new Subscriber("sub5");
		
		ourIndia.subscribe(s1);
		ourIndia.subscribe(s2);
		ourIndia.subscribe(s3);
		ourIndia.unsubscribe(s4);
		ourIndia.subscribe(s5);
		
		ourIndia.upload("Andhi");
		
		
	}

}
