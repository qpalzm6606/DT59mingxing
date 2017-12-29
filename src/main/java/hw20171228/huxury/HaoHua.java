package hw20171228.huxury;

import hw20171228.Car;

public class HaoHua extends Car {
	String name = "豪华车";
	String texing = "贵";
	public void summary(){
   	 System.out.println("我是一辆" + name+"我的载客量为"+site+"我的特点是"+texing);
    }
	public static void main(String[] args) {
		HaoHua a = new HaoHua();
		a.summary();
	}
}
