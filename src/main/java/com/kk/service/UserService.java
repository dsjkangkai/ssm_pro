package com.kk.service;

import com.kk.po.UserPo;
import java.util.List;
import java.util.Map;

/**
* Created by kk on 2019-12-10.
*/
public interface UserService {

    int insert(UserPo user);

    int delete(UserPo user);

    int deletes(Integer[] ids);

    int update(UserPo user);

    UserPo selectById(Integer id);

    List<UserPo> select(Map<String, Object> map);

    UserPo getUserByName(String username);
}