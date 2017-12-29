package hw20171228;

public class LittleCar extends Car {
        
         LittleCar(int site){
        	 setSite(site);
         }
         LittleCar(String name){
        	 setName(name);
         }
         public static void main(String[] args) {
        	 LittleCar a = new LittleCar(4);
        	 LittleCar b = new LittleCar("雪佛兰");
        	 a.summary();
        	 b.xinghao();
		}
}
