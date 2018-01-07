/**
 * Project Name:dt59homework
 * File Name:DataDemo.java
 * Package Name:Hw20180106
 * Date:2018年1月7日下午8:38:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package Hw20180106;

import java.text.SimpleDateFormat;
import java.util.Date;





/**
 * Description:	   <br/>
 * Date:     2018年1月7日 下午8:38:04 <br/>
 * @author   dingP
 * @version  
 * @see 	 
 */
public class DataDemo {

    public static void main(String[] args) {
               time();
               time1();
               time2();
               time3();
               time4();

    }
    public static void time(){
         Date data = new Date();//Date的空参构造方法获得的是当前系统时间
         System.out.println(data);
    }
    public static void time1(){
        Date data = new Date(0);//Date的有参构造传递毫秒值以获得对应的日期
        System.out.println(data);
        
    }
    public static void time2(){
        Date date = new Date();
        long time = date.getTime();//Date类的getTime方法将当前日期转换成毫秒值
        System.out.println(time);
    }
    public static void time3(){
        Date date = new Date();
        System.out.println(date);
         date.setTime(22);//setTime方法将毫秒值转换成日期
         System.out.println(date);
    }
    public static void time4(){
        SimpleDateFormat time = new SimpleDateFormat("YYYY年MM月dd日HH点mm分钟ss秒");//日期的格式化
        String time1 = time.format(new Date());
        System.out.println(time1);
    }
}

