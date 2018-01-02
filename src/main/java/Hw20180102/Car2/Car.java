package Hw20180102.Car2;

public abstract class Car {
       private String name;
       private int Speed;// 极限速度(speed)单位:千米每小时
       
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return Speed;
	}
	public void setSpeed(int speed) {
		Speed = speed;
	}
	public abstract void fire();
	
}
