/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.service.impl 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年4月18日 下午4:31:43 
 */
package xyz.wadewhy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.wadewhy.domain.Menu;
import xyz.wadewhy.mapper.MenuMapper;
import xyz.wadewhy.service.MenuService;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年4月18日 下午4:31:43
* 类说明
*/
/** 
* @ClassName: MenuServiceImpl 
* @Description: TODO
* @author: wadewhy
* @date: 2020年4月18日 下午4:31:43  
*/
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;

    /* (non-Javadoc)
     * @see xyz.wadewhy.service.MenuService#queryAllMenu()
     */
    public List<Menu> queryAllMenu() {
        // TODO Auto-generated method stub
        return menuMapper.queryAllMenu();

    }

}
