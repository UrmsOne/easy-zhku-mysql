/*
 *@Type Test.java
 * @Desc
 * @Author urmsone urmsone@163.com
 * @date 2024/4/8 08:21
 * @version
 */
package cn.zhku.easy;

import cn.zhku.easy.dao.user.UserDao;
import cn.zhku.easy.dao.user.impl.UserDaoImpl;
import cn.zhku.easy.dto.UserQueryParam;
import cn.zhku.easy.model.User;
import cn.zhku.easy.utils.DBUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        UserDao userDao = new UserDaoImpl();
//        User user = userDao.getUserByID(1);
//        System.out.println(user.toString());
//        List<User> users = new ArrayList<>();
//        UserQueryParam queryParam = new UserQueryParam();
//        queryParam.setPage(1);
//        queryParam.setTotal(4);
//        users = userDao.getList(queryParam);
//        System.out.println(users.toString());
        User user = new User();
        user.setUsername("handsome");
        user.setEmail("hahaha@163.com");
        Date date = new Date(100, 2,2);
        user.setBirthdate(date);
        user.setIsActive(1);
        int res = userDao.insertUser(user);
        System.out.println("insert result: " + res);
    }
}
