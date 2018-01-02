package Hw20180102.plane3;

public class TestPlane {
       public static void main(String[] args) {
		Plane a = new CivilAircraft();
		Plane b = new Warcraft();
		a.fly();
		b.fly();
		System.out.println(a.getName()+"\t飞行高度为:"+a.getAltitude());
		System.out.println(b.getName()+"\t飞行高度为:"+b.getAltitude());
	}
}
