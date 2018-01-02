package Hw20180102.Car2;

public class Truck extends Car {
	  private String oils;//车子加油
	 
	public String getOils() {
		return oils;
	}

	public void setOils(String oils) {
		if("柴油".equals(oils)){
		this.oils = oils;}
		else{
			System.out.println("油加错了");
		}
	}

	public void fire() {
		this.setName("福特");
		this.setSpeed(150);
		
	}

}
