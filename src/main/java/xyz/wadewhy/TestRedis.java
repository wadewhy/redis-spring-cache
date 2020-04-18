/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年4月18日 下午4:33:30 
 */
package xyz.wadewhy;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xyz.wadewhy.domain.Menu;
import xyz.wadewhy.service.MenuService;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年4月18日 下午4:33:30
* 类说明
*/
/** 
* @ClassName: TestRedis 
* @Description: TODO
* @author: wadewhy
* @date: 2020年4月18日 下午4:33:30  
*/
public class TestRedis {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        MenuService menuService = context.getBean(MenuService.class);
        List<Menu> menu = menuService.queryAllMenu();

        for (Menu menu2 : menu) {
            System.out.println(menu2);
        }
    }
}
