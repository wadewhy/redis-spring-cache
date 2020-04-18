
/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.service 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年4月18日 下午4:30:14 
 */
package xyz.wadewhy.service;

import java.util.List;

import xyz.wadewhy.domain.Menu;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年4月18日 下午4:30:14
* 类说明
*/
/** 
* @ClassName: MenuService 
* @Description: TODO
* @author: wadewhy
* @date: 2020年4月18日 下午4:30:14  
*/
public interface MenuService {
    List<Menu> queryAllMenu();
}
