/**
 * Project Name:dt59homework
 * File Name:TestCar.java
 * Package Name:Hw20180104
 * Date:2018年1月4日下午6:33:57
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package Hw20180104;

import java.io.ObjectInputStream.GetField;
import java.util.LinkedList;

import org.apache.log4j.Logger;

/**
 * Description:	   <br/>
 * Date:     2018年1月4日 下午6:33:57 <br/>
 * @author   dingP
 * @version  
 * @see 	 
 */
public class TestCar {
    private final static Logger LOG = Logger.getLogger(TestCar.class);

    public static void main(String[] args) {
        
    
    Car a = new Car("奥迪",40);
    Car b = new Car("雪佛兰",10);
    Car c = new Car("富康",5);
    Car d = new Car("保时捷",100);
    
    LinkedList cars = new LinkedList();
    cars.add(a);
    cars.add(b);
    cars.add(c);
    cars.add(2,d);
    Car carFirst = (Car)cars.getFirst();
    LOG.info("第一台车是"+carFirst.getName());
    Car carLast = (Car)cars.getLast();
    LOG.info("最后一台车是"+carLast.getName());
     cars.removeFirst();
     cars.removeLast();
     LOG.info("删除第一台车和最后一台车");
     LOG.info("剩下"+cars.size()+"台车");
     LOG.info("分别是");
     for (int i = 0; i < cars.size(); i++) {
         Car e = (Car)cars.get(i);
        LOG.info(e.getName()+e.getMoney());
    }
     
    }
       
}

