package Hw20180102.plane3;

public class Warcraft extends Plane{
	private String purpose;//用途

	
	public void fly() {
		setAltitude(20000);
		setName("歼20");
	}


	public String getPurpose() {
		return purpose;
	}


	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
}
