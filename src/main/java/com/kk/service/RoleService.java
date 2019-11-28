package com.kk.service;

import com.kk.po.Role;

import java.util.List;

/**
* Created by ZTCGenerator<zingon@aliyun.com> on 2019-11-28.
*/
public interface RoleService {

    int insert(Role role);

    int delete(Role role);

    int deletes(Integer[] ids);

    int update(Role role);

    List<Role> select(Role role);
}