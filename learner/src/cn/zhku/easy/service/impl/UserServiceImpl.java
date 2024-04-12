/*
 *@Type UserServiceImpl.java
 * @Desc
 * @Author urmsone urmsone@163.com
 * @date 2024/4/8 08:30
 * @version
 */
package cn.zhku.easy.service.impl;

import cn.zhku.easy.dao.user.UserDao;
import cn.zhku.easy.dao.user.impl.UserDaoImpl;
import cn.zhku.easy.model.User;
import cn.zhku.easy.service.UserService;


public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(long id) {
        return null;
    }

    @Override
    public User getUserByName(String name) throws Exception {
        UserDao dao = new UserDaoImpl();
        return dao.getUserByName(name);
    }
}
