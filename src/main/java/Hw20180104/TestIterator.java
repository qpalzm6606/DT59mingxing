/**
 * Project Name:dt59homework
 * File Name:TestIterator.java
 * Package Name:Hw20180104
 * Date:2018年1月4日下午7:45:31
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package Hw20180104;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * Description:	   <br/>
 * Date:     2018年1月4日 下午7:45:31 <br/>
 * @author   dingP
 * @version  
 * @see 	 
 */
public class TestIterator {
    private final static Logger LOG = Logger.getLogger(TestIterator.class);

        public static void main(String[] args) {
            Car a = new Car("奥迪",40);
            Car b = new Car("雪佛兰",10);
            Car c = new Car("富康",5);
            Car d = new Car("保时捷",100);
            Map carMap = new HashMap();
            carMap.put(a.getName(), a);
            carMap.put(b.getName(), b);
            carMap.put(c.getName(),c);
            carMap.put(d.getName(), d);
            Set keys = carMap.keySet();
            Iterator it = keys.iterator();
            while(it.hasNext()){
               String key = (String)it.next();
                Car f = (Car)carMap.get(key);

                LOG.info(key+"\t"+f.getMoney());
            }
            
        }
}

