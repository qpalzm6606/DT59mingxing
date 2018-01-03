/**
 * Project Name:dt59homework
 * File Name:Car.java
 * Package Name:Hw20180103.Car
 * Date:2018年1月3日下午7:38:30
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package Hw20180103.Car;
/**
 * Description:	   <br/>
 * Date:     2018年1月3日 下午7:38:30 <br/>
 * @author   dingP
 * @version  
 * @see 	 
 */
public abstract class Car {
      private String name;
      private int speed;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public abstract void run();
        
    
      
}

