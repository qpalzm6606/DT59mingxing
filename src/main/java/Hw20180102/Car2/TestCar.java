package Hw20180102.Car2;

public class TestCar {
	
     public static void main(String[] args) {
    	 Car a = new Truck();
    	 Car b = new SportsCar();
    	 ((SportsCar) b).setOils("汽油");
    	 ((Truck) a).setOils("柴油");
    	 a.fire();
    	 b.fire();
    	 System.out.println(a.getName()+"\t最高时速为："+a.getSpeed()+"\t燃油类型:"+((Truck) a).getOils());
    	 System.out.println(b.getName()+"\t最高时速为："+b.getSpeed()+"\t燃油类型："+((SportsCar) b).getOils());
	}
}
