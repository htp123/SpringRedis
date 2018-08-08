/**
 * Created by Administrator on 2018/8/2.
 */
package com.htp;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htp.util.RedisUtil;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

public class MainRedisClass {
    public static Logger logger=Logger.getLogger(MainRedisClass.class);

    public static void main(String[] args) {

        // TODO Auto-generated method stub


        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");//

        RedisUtil redisUtil= (RedisUtil) context.getBean("redisUtil");
        redisUtil.set("abc", "123");
        System.out.println(redisUtil.get("abc").toString());


        Set<Serializable> rst = redisUtil.keys();

        if(rst != null) {
            Iterator iterator = rst.iterator();

            while (iterator.hasNext()) {
                String key = iterator.next().toString();
                String value = redisUtil.get(key).toString();
                System.out.println(key + ":" + value);

            }
        }
    }

}
