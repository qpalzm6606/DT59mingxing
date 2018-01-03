/**
 * Project Name:dt59homework
 * File Name:SportsCar.java
 * Package Name:Hw20180103.Car
 * Date:2018年1月3日下午7:39:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package Hw20180103.Car;

import java.util.Scanner;

/**
 * Description:	   <br/>
 * Date:     2018年1月3日 下午7:39:04 <br/>
 * @author   mingX
 * @version  
 * @see 	 
 */
public class SportsCar extends Car implements Lock {

    
    public void slewing() { //通过键盘输入控制开锁关锁
          Scanner scanner = new Scanner(System.in);
          String a  = scanner.next();
          System.out.println("输入y开锁 其他任意键关锁");
          if("y".equals(a)){
              System.out.println("开锁");}
              else{
                  System.out.println("关锁");
             scanner.close(); }
          }

   
    public void run() {
         this.slewing();                        //开锁后车就可以发动了
        
                        
       
        
    }
          
       
        
    }
        


