package com.kk.dao;

import com.kk.po.RolePo;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
* Created by kk on 2019-12-10.
*/
public interface RoleDao {

    int insert(RolePo role);

    int delete(RolePo role);

    int deletes(@Param("ids") Integer[] ids);

    int update(RolePo role);

    List<RolePo> select(Map<String, Object> map);

}