/**
 * Project Name:dt59homework
 * File Name:Test.java
 * Package Name:Hw20180104
 * Date:2018年1月4日下午5:41:57
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package Hw20180104;


import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.MidiDevice.Info;

import org.apache.log4j.Logger;

import Hw20180103.LogDemo;

/**
 * Description:	   <br/>
 * Date:     2018年1月4日 下午5:41:57 <br/>
 * @author   dingP
 * @version  
 * @see 	 
 */
public class Test {
    private final static Logger LOG = Logger.getLogger(Test.class);

    public static void main(String[] args) {
               Car a = new Car("奥迪",40);
               Car b = new Car("雪佛兰",10);
               Car c = new Car("富康",5);
               Car d = new Car("保时捷",100);
               List e = new ArrayList();
               e.add(a);
               e.add(b);
               e.add(c);
               e.add(2,d);
               LOG.info("共有4台车");
               LOG.info("分别是：");
            for (int i = 0; i < e.size(); i++) {
                Car f = (Car)e.get(i);
                LOG.info(f.getName()+f.getMoney());
            }
            LOG.info("删除车辆信息");
            LOG.info("删除之前共有"+e.size()+"辆车");//删除第一辆车和保时捷
            e.remove(0);
            e.remove(d);
            LOG.info("删除后有:"+e.size()+"辆车");
            for (int i = 0; i < e.size(); i++) {
                LOG.info("分别有");
                Car g = (Car)e.get(i);
                LOG.info(g.getName()+g.getMoney());
            }
            if(e.contains(b)){
                LOG.info("有雪佛兰");
            }
            else{
                LOG.info("没有雪佛兰");
            }
         
            
               
        }
        
         

    }



