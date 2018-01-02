package Hw20180102.Car2;

public class SportsCar extends Car {
     private String oils;
	
	public String getOils() {
		return oils;
	}

	public void setOils(String oils) {
		if("汽油".equals(oils)){
		this.oils = oils;}
		else{
			System.out.println("油加错了");
		}
	}

	public void fire() {
		this.setName("保时捷");
		this.setSpeed(300);
	}

}
