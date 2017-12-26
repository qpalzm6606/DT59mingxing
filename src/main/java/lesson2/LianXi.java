package lesson2;

public class LianXi {
       String laoshi;
        
       void teching(){
    	     System.out.println("教一班学习java");
       }
       void teching1(){
    	    System.out.println("教二班学习java");
       }
       
       public static void main(String[] args) {
		String xuesheng1;
		String xuesheng2;
		LianXi asd = new LianXi();
		asd.laoshi="学习java";
		asd.teching();
	}
       public static void bangji1(String[] args) {
    	 LianXi dsa = new LianXi();
    	 dsa.laoshi="教一班学习";
}
}