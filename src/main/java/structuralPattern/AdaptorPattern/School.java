package structuralPattern.AdaptorPattern;

public class School {

	public static void main(String[] args) {
	//PilotPen p = new PilotPen();
	PenAdaptor p = new PenAdaptor();
	AssignmentWork aw = new AssignmentWork();
	aw.setP(p);
	aw.write("I am writing");
	}

}
