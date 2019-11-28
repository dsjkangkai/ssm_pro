package com.kk.dao;

import java.util.List;

import com.kk.po.Role;
import org.apache.ibatis.annotations.Param;

/**
* Created by ZTCGenerator<zingon@aliyun.com> on 2019-11-28.
*/
public interface RoleDao {

    int insert(Role role);

    int delete(Role role);

    int deletes(@Param("ids") Integer[] ids);

    int update(Role role);

    List<Role> select(Role role);
}