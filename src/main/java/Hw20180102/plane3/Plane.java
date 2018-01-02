package Hw20180102.plane3;

public abstract class Plane {
          private String name;
          private double altitude;//飞机的飞行高度
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getAltitude() {
			return altitude;
		}
		public void setAltitude(double altitude) {
			this.altitude = altitude;
		}
		public abstract void fly();
}
