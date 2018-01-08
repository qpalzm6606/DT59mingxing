/**
 * Project Name:dt59homework
 * File Name:RunnableDemo.java
 * Package Name:Hw20180108
 * Date:2018年1月8日下午5:10:01
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package Hw20180108;

import org.apache.log4j.Logger;

/**
 * Description:	   <br/>
 * Date:     2018年1月8日 下午5:10:01 <br/>
 * @author   dingP
 * @version  
 * @see 	 
 */
public class RunnableDemo implements Runnable {
    private final static Logger LOG = Logger.getLogger(RunnableDemo.class);
    long a ;
    public RunnableDemo(long a) {
        this.a=a;

        

    }
    
    public void run() {
        LOG.info("明星真帅"+a);
       
        
    }

}

