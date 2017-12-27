package hw20171227;

public class luFei {
   String name;
   int age;
   public luFei(String name,int age){
	  name="路飞";
	  age=17;
	  System.out.println(name+age);
	   
   }
   public static void main(String[] args) {
	     luFei a = new luFei("索隆",2);
	     System.out.println(a.age+a.name);
}
}
