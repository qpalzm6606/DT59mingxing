package Hw20180102;

public abstract  class Gun1 {
     private String name;
     private double range;//射程(range)单位为公尺(m)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRange() {
		return range;
	}
	public void setRange(double range) {
		this.range = range;
	}
	public abstract void fire();
}
