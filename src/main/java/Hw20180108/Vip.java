/**
 * Project Name:dt59homework
 * File Name:Vip.java
 * Package Name:Hw20180108
 * Date:2018年1月8日下午5:16:05
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package Hw20180108;
/**
 * Description:	   <br/>
 * Date:     2018年1月8日 下午5:16:05 <br/>
 * @author   dingP
 * @version  
 * @see 	 
 */
public class Vip {
      public static void main(String[] args) {
          for (int i = 0; i < 199; i++) {
              ThRead a = new ThRead(i);
              if(i==198){//6是VIP
                  a.setPriority(Thread.MAX_PRIORITY);
                  
                  a.start();
              }
              else{
                  a.start();
              }
        }
          
    }
}

