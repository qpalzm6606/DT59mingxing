package hw20171228;

public class Bus extends Car {
	 String name = "京龙";
	 Bus(int site){
		 setSite(site);
	 }
	
     
     public static void main(String[] args) {
         Bus bus = new Bus(20);
         bus.summary();
	}
}
