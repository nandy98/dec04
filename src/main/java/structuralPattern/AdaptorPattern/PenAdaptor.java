package structuralPattern.AdaptorPattern;

public class PenAdaptor implements Pen{
	
	PilotPen p = new PilotPen();
	
	public void write(String str) {
	
		p.mark(str);
	}
	
	

}
