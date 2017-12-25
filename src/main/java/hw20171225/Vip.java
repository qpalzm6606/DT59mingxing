package hw20171225;

import java.util.Scanner;



public class Vip {
	double s(){
		return 0.75;
	}
	double a(){
		return 0.8;
	}
    double b(){
    	return 0.85;
    }
    double c(){
    	return 0.9;
    }
    double d(){
    	return 0.95;
    }
    
    public static void main(String[] args) {
    	Vip vip = new Vip();
    	
		System.out.println("请选择会员等级s,a,b,c,d");
		 Scanner scanner = new Scanner(System.in);
		     String dengji = scanner.next();
		     System.out.println("请输入购物金额");
		     int jinger = scanner.nextInt();
		    switch(dengji){
		    case "s":
		      System.out.println("折后金额为"+jinger*vip.s());
		      break;
		    case "a":
		    	System.out.println("折后金额为"+jinger*vip.a());
		    	break;
		    case "b":
		    	System.out.println("折后金额为"+jinger*vip.b());
		    	break;
		    case "c":
		    	System.out.println("折后金额为"+jinger*vip.c());
		    	break;
		    case "d":
		    	System.out.println("折后金额为"+jinger*vip.d());
		    	break;
		      
		    }
		
		    scanner.close();
	}
}
