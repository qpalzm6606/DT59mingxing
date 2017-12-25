package hw20171225;

import java.util.Random;



public class zuoye1 {
     
      
             
      void bidaxiao(int xiao,int da){
    	    if(xiao>da){
    	    	System.out.println(xiao);
    	    }
    	    else{
    	    	System.out.println(da);
    	    }
      }
      
      public static void main(String[] args) {
    	  Random ran = new Random();
    	  int r = ran.nextInt(100);
    	  int r1 = ran.nextInt(100);
    	  
		zuoye1 zuoye = new zuoye1();
		 zuoye.bidaxiao(r, r1);
		
	}
}
