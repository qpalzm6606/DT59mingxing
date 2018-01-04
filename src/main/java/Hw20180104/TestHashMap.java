/**
 * Project Name:dt59homework
 * File Name:TestHashMap.java
 * Package Name:Hw20180104
 * Date:2018年1月4日下午7:18:38
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package Hw20180104;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * Description:	   <br/>
 * Date:     2018年1月4日 下午7:18:38 <br/>
 * @author   dingP
 * @version  
 * @see 	 
 */
public class TestHashMap {
    private final static Logger LOG = Logger.getLogger(TestHashMap.class);
    public static void main(String[] args) {
           Map battleship = new HashMap();
           battleship.put("CVA","航空母舰");
           battleship.put("BB", "战列舰");
           battleship.put("CA", "重巡洋舰");
           battleship.put("CL", "轻巡洋舰");
           String zhanj = (String)battleship.get("CVA");
           LOG.info("CVA对应的值是"+zhanj);
           LOG.info("Map中共有"+battleship.size()+"组元素");
           Boolean f = battleship.containsKey("BB");
           LOG.info("Map中包含BB的Key吗");
           if(f==true){
               LOG.info("包含");
           }
           else{
               LOG.info("不包含");
           }
           LOG.info(battleship.keySet());
           LOG.info(battleship.values());
           LOG.info(battleship);
           battleship.clear();
           if(battleship.isEmpty()){
               LOG.info("已清空数据");
           }
           
           

    }

}

