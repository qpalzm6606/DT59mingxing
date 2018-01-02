package Hw20180102.plane3;

public class CivilAircraft extends Plane {
      private String purpose;//用途
	
	public void fly() {
		setName("波音747");
		setAltitude(10000);
		
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

}
