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
        String sql = "select * from users where id = ?";
        try (ResultSet resultSet = DBUtils.executeQuery(sql, id)) {
            if (resultSet.next()) {
                // TODO://如何接入Javabean来实现数据库字段与对象属性的自动转换？
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
    public User getUserByName(String name) throws Exception {
        User user = null;
        String sql = "select * from users where username = ?";
        try (ResultSet resultSet = DBUtils.executeQuery(sql, name)) {
            if (resultSet.next()) {
                // TODO://如何接入Javabean来实现数据库字段与对象属性的自动转换？
                user = new User();
                user.setId(resultSet.getLong("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setEmail(resultSet.getString("email"));
                user.setBirthdate(resultSet.getDate("birthdate"));
                user.setIsActive(resultSet.getInt("is_active"));
            }
        }
        return user;
    }

    @Override
    public int insertUser(User user) throws Exception {
        /*
         * TODO:// sql的拼接是否可以在dto的class里面提供一个方法来实现？
         *  DBUtils.executeInsert的...params是否也可以通过dto的一个方法返回？
         */
        String sql = "insert into users (username,email,birthdate,is_active) values (?,?,?,?)";
        int result = -1;
        try {
            result = DBUtils.executeInsert(sql, user.getUsername(), user.getEmail(), user.getBirthdate(), user.getIsActive());
        } catch (SQLException e) {
            throw e;
        }

        return result;
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
