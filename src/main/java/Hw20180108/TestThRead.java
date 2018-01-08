/**
 * Project Name:dt59homework
 * File Name:TestThRead.java
 * Package Name:Hw20180108
 * Date:2018年1月8日下午5:08:32
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package Hw20180108;
/**
 * Description:	   <br/>
 * Date:     2018年1月8日 下午5:08:32 <br/>
 * @author   dingP
 * @version  
 * @see 	 
 */
public class TestThRead {
     public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            ThRead a = new ThRead(i);
            a.start();
        }
    }
}

