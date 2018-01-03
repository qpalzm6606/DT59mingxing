/**
 * Project Name:dt59homework
 * File Name:exceptions.java
 * Package Name:Hw20180103.Car.exceptions
 * Date:2018年1月3日下午8:02:56
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package Hw20180103.Car.exceptions;
/**
 * Description:	   <br/>
 * Date:     2018年1月3日 下午8:02:56 <br/>
 * @author   dingP
 * @version  
 * @see 	 
 */
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字");
        try{int b  =  scanner.nextInt();
        System.out.println(b);}catch(Exception e){
            System.out.println("请输入整数");
        }
         scanner.close();
    }

}
