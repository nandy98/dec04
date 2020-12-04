package behavioralPattern.Observerpattern1;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	private String name;
	private List<Subscriber> subs= new ArrayList();
	private String title;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void subscribe(Subscriber sub) {
	subs.add(sub);
	}
	
	public void unsubscribe(Subscriber sub) {
		subs.remove(sub);
		}
	
	public void notifySubscriber() {
		for(Subscriber sub : subs) {
			sub.update();
		}
		
		}
	public void upload(String title) {
		this.title = title;
		notifySubscriber();
	}
	
}
