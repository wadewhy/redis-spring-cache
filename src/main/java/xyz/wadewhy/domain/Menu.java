/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.domain 
 * @author: 钟子豪   网站wadewhy.xyz
 * @date: 2020年4月18日 下午4:20:03 
 */
package xyz.wadewhy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年4月18日 下午4:20:03
* 类说明
*/
/** 
* @ClassName: Menu 
* @Description: TODO
* @author: wadewhy
* @date: 2020年4月18日 下午4:20:03  
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private Integer id;

    private String title;

    private String icon;

    private String href;

    private Boolean spread;

    private Integer pid;

    private String target;

    private Integer available;

}
