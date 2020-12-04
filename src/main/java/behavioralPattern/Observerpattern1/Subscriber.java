package behavioralPattern.Observerpattern1;

public class Subscriber {
	
	private String name;
	private Channel ch;
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	public void subscribedChannel(Channel ch) {
		this.ch = ch;
	}
	
	public void update(){
		System.out.println("name " + name + "  chanel updated");
	}

}
