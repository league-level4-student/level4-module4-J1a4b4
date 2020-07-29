package _04_hospital;

public class Patient {

	private boolean feelsCaredFor;

	public boolean feelsCaredFor() {
		return feelsCaredFor;
	}

	public void setFeelsCaredFor(boolean feelsCaredFor) {
		this.feelsCaredFor = feelsCaredFor;
	}

	public void checkPulse() {
		setFeelsCaredFor(true);
	}
	
}
