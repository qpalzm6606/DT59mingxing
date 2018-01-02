package Hw20180102;



public class TestGun1 {

	public static void main(String[] args) {
		Gun1 a = new HandGun1();
		Gun1 b = new SniperRifle1();
		  a.fire();
		  b.fire();
         System.out.println("手枪的名字为:"+a.getName()+"\t射程为:"+a.getRange());
         System.out.println("狙击步枪的名字为:"+b.getName()+"\t射程为:"+b.getRange());
	}

	
}
