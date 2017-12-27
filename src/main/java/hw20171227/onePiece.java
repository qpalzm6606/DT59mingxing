package hw20171227;

public class onePiece {
	String name = "路飞";
	int age = 17;
	String ability  = "橡胶果实";
	public onePiece(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(ability);
		name = "索隆";
		age = 18;
		ability = "三刀流";
	}
	public static void main(String[] args) {
		onePiece a = new onePiece();
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.ability);
		
	}

}
