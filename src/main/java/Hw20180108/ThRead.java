/**
 * Project Name:dt59homework
 * File Name:ThRead.java
 * Package Name:Hw20180108
 * Date:2018年1月8日下午5:05:06
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package Hw20180108;



import org.apache.log4j.Logger;

/**
 * Description:	   <br/>
 * Date:     2018年1月8日 下午5:05:06 <br/>
 * @author   dingP
 * @version  
 * @see 	 
 */
public class ThRead extends Thread {
    private final static Logger LOG = Logger.getLogger(ThRead.class);

        long a ;
        public ThRead(long a){
            this.a = a;
        }
     public void run(){
         if(a==198){
         LOG.info("第"+a+"个"+"VIP66666666666666666666");}
         else{
             LOG.info("第"+a+"个");
         }
     }
}

