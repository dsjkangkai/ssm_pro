package com.kk.service;

import com.kk.po.RolePo;
import com.kk.po.RolePo;

import java.util.List;
import java.util.Map;

/**
* Created by kk on 2019-12-10.
*/
public interface RoleService {

    int insert(RolePo role);

    int delete(RolePo role);

    int deletes(Integer[] ids);

    int update(RolePo role);

    List<RolePo> select(Map<String, Object> map);

}