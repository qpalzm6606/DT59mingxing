/**
 * Project Name:dt59homework
 * File Name:TestHashSet.java
 * Package Name:Hw20180104
 * Date:2018年1月4日下午6:57:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package Hw20180104;
import java.util.Set;
import java.util.HashSet;
 

import org.apache.log4j.Logger;

/**
 * Description:	   <br/>
 * Date:     2018年1月4日 下午6:57:43 <br/>
 * @author   dingP
 * @version  
 * @see 	 
 */
public class TestHashSet {
    private final static Logger LOG = Logger.getLogger(TestHashSet.class);

       public static  void main(String[] args) {
           Car a = new Car("奥迪",40);
           Car b = new Car("雪佛兰",10);
           Car c = new Car("富康",5);
           Car d = new Car("保时捷",100);
           Set cars = new HashSet();
           cars.add(a);
           cars.add(b);
           cars.add(c);
          boolean f = cars.contains(d);//判断集合中是否有d
           LOG.info("判断集合中是否有d");
          if(f==true){
              LOG.info("集合中有d");
          }
          else{
              LOG.info("集合中没有d");
          }
          LOG.info("集合中有"+cars.size()+"个元素");
          cars.clear();//删除集合中的所有元素
          LOG.info("集合中有"+cars.size()+"个元素");
    }
}

