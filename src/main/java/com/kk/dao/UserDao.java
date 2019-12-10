package com.kk.dao;

import com.kk.po.UserPo;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
* Created by kk on 2019-12-10.
*/
public interface UserDao {

    int insert(UserPo user);

    int delete(UserPo user);

    int deletes(@Param("ids") Integer[] ids);

    int update(UserPo user);

    List<UserPo> select(Map<String, Object> map);

    UserPo selectById(Integer id);

    UserPo getUserByName(String username);
}