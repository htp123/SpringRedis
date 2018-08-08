/**
 * Created by Administrator on 2018/8/2.
 */
package com.htp.test;

import com.htp.util.RedisUtil;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainRedisClass {
    public static Logger logger=Logger.getLogger(MainRedisClass.class);
    public static void main(String[] args) {

        // TODO Auto-generated method stub

//        PropertyConfigurator.configure("C:/Users/zhao/Desktop/log4j.properties");//这里配置自己的log4j 也可不用注释了也可以
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:config/applicationContext.xml");//

        RedisUtil redisUtil= (RedisUtil) context.getBean("redisUtil");
        redisUtil.set("abc", "123");


    }

}
