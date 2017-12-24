package dt59homework;

public class Dog {
	 String name;
	 String breed;
	 int age;
	void eat(){
		System.out.println("吃骨头");
	}
	String guard(){
		
		return "真乖";
	}
   void voice(){
	   System.out.println("汪汪汪");
   }
    public static void main(String[] args) {
		
	
   Dog dog = new Dog();
    dog.name="旺旺";
    dog.age = 1;
    dog.breed = "比熊";
    System.out.println("看门" +dog.guard());
    dog.voice();
    dog.eat();
}
}