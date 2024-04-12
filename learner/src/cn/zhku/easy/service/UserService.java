/*
 *@Type UserService.java
 * @Desc
 * @Author urmsone urmsone@163.com
 * @date 2024/4/8 08:29
 * @version
 */
package cn.zhku.easy.service;

import cn.zhku.easy.model.User;

public interface UserService {
    /*
    * 根据id查询用户信息
    * */
    User getUserById(long id) throws Exception;
    User getUserByName(String name) throws Exception;
}
