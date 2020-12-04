package behavioralPattern.Observerpattern;

public class Subscriber {
	
	private String name;
	private Channel ch;
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	
	public void subscriberChannel(Channel ch) {
		this.ch=ch;
	}
	
	public void update() {
		System.out.println("Subscriber name "+ name+ " updated");
	}
}
