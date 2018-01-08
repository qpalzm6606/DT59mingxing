/**
 * Project Name:dt59homework
 * File Name:TestRunnableDemo.java
 * Package Name:Hw20180108
 * Date:2018年1月8日下午5:12:54
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package Hw20180108;
/**
 * Description:	   <br/>
 * Date:     2018年1月8日 下午5:12:54 <br/>
 * @author   dingP
 * @version  
 * @see 	 
 */
public class TestRunnableDemo {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            RunnableDemo a = new RunnableDemo(i);
            new Thread(a).start();
        }
        
    }

}

