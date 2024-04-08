/*
 *@Type Test.java
 * @Desc
 * @Author urmsone urmsone@163.com
 * @date 2024/4/8 10:21
 * @version
 */
package cn.zhku.easy.dao.user.impl;

import cn.zhku.easy.dao.user.UserDao;
import cn.zhku.easy.dto.UserQueryParam;
import cn.zhku.easy.dto.UserUpdateParam;
import cn.zhku.easy.model.User;
import cn.zhku.easy.utils.DBUtils;
//import org.apache.commons.beanutils.BeanUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<User> getList(UserQueryParam queryParam) throws Exception {
        String sql = "select * from users limit ?,?";
        List<User> users = new ArrayList<>();
        int total = queryParam.getTotal() > 0 ? queryParam.getTotal() : 10;
        int offset = Math.max((queryParam.getPage() - 1) * total, 0);

        try (ResultSet resultSet = DBUtils.executeQuery(sql, offset, total)) {
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getLong("id"));
                user.setUsername(resultSet.getString("username"));
                user.setEmail(resultSet.getString("email"));
                user.setBirthdate(resultSet.getDate("birthdate"));
                user.setIsActive(resultSet.getInt("is_active"));
                users.add(user);
            }
        }
        return users;
    }

    @Override
    public User getUserByID(long id) throws Exception {
        User user = null;
        Connection conn = DBUtils.getConnection();
        String sql = "select * from users where id = ?";
        try (ResultSet resultSet = DBUtils.executeQuery(sql, id)) {
            if (resultSet.next()) {
                System.out.println("=======");
                user = new User();
                user.setId(resultSet.getLong("id"));
                user.setUsername(resultSet.getString("username"));
                user.setEmail(resultSet.getString("email"));
                user.setBirthdate(resultSet.getDate("birthdate"));
                user.setIsActive(resultSet.getInt("is_active"));
            }
        }
        return user;
    }

    @Override
    public int insertUser(User user) {
        return 0;
    }

    @Override
    public int deleteUserByID(long id) {
        return 0;
    }

    @Override
    public int updateUserInfoByID(UserUpdateParam updateParam) {
        return 0;
    }
}
