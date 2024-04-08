/*
 *@Type Test.java
 * @Desc
 * @Author urmsone urmsone@163.com
 * @date 2024/4/8 10:21
 * @version
 */
package cn.zhku.easy.dao.user;

import cn.zhku.easy.dto.UserQueryParam;
import cn.zhku.easy.dto.UserUpdateParam;
import cn.zhku.easy.model.User;

import java.util.List;

public interface UserDao {
    /*
     * 根据条件查询订单，做好分页处理
     * */
    List<User> getList(UserQueryParam queryParam) throws Exception;

    User getUserByID(long id) throws Exception;

    int insertUser(User user) throws Exception;

    int deleteUserByID(long id) throws Exception;

    int updateUserInfoByID(UserUpdateParam updateParam) throws Exception;
}
