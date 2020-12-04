package behavioralPattern.Observerpattern;

public class Youtube {
	
	public static void main(String args [] ) {
	Channel tiger = new Channel();
	
	Subscriber s1 = new Subscriber("sub1");
	Subscriber s2 = new Subscriber("sub2");
	Subscriber s3 = new Subscriber("sub3");
	Subscriber s4 = new Subscriber("sub4");
	Subscriber s5 = new Subscriber("sub5");
	
	tiger.subscribe(s1);
	tiger.subscribe(s2);
	tiger.subscribe(s3);
	tiger.subscribe(s4);
	tiger.subscribe(s5);
	
	tiger.notifySubscriber();
	
	}
}
