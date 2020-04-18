/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.cache 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年4月18日 下午4:38:09 
 */
package xyz.wadewhy.cache;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import xyz.wadewhy.domain.Menu;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年4月18日 下午4:38:09
* 类说明
*/
/** 
* @ClassName: MenuAspectCache 
* @Description: TODO
* @author: wadewhy
* @date: 2020年4月18日 下午4:38:09  
*/
@Component
@EnableAspectJAutoProxy
@Aspect
@Slf4j
public class MenuAspectCache {

    private final static String PONIT_ALLMENU = "execution(* xyz.wadewhy.service.impl.MenuServiceImpl.queryAllMenu(..))";
    private final static String ALL_MENU_KEY = "all_menu";
    @Autowired
    private JedisPool jedisPool;

    @Around(value = PONIT_ALLMENU)
    public Object cacheAllMenu(ProceedingJoinPoint proceed) throws Throwable {
        // 1.先从redis里面找
        // 得到redis
        Jedis jedis = jedisPool.getResource();
        // 获取
        String json = jedis.get(ALL_MENU_KEY);
        if (null == json) {// 2.为空
            log.info("cacheAllMenu---------------------->缓存里面没有数据，去查询数据库并存入缓存");
            System.err.println("cacheAllMenu---------------------->缓存里面没有数据，去查询数据库并存入缓存");
            // 放行，去查找
            Object object = proceed.proceed();
            // 然后再redis里保存【由于查出来的是List对象，以json格式存储比较好】
            jedis.set(ALL_MENU_KEY, JSON.toJSONString(object));
            return object;
        } else {// 不为空
            //
            log.info("cacheAllMenu---------------------->已从缓存找到数据，直接返回");
            System.err.println("cacheAllMenu---------------------->已从缓存找到数据，直接返回");
            return JSON.parseArray(json, Menu.class);

        }
    }
}
