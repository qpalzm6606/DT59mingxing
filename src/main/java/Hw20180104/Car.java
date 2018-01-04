/**
 * Project Name:dt59homework
 * File Name:Dog.java
 * Package Name:Hw20180104
 * Date:2018年1月4日下午5:42:47
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package Hw20180104;
/**
 * Description:	   <br/>
 * Date:     2018年1月4日 下午5:42:47 <br/>
 * @author   dingP
 * @version  
 * @see 	 
 */
public class Car {
     private String name;//车名   
     private int money;//车的价格
   
       Car(String name,int money){
           this.name=name;
           this.money=money;
       }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

