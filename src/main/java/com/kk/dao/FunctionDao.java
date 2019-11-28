package com.kk.dao;

import java.util.List;

import com.kk.po.Function;
import org.apache.ibatis.annotations.Param;

/**
* Created by ZTCGenerator<zingon@aliyun.com> on 2019-11-28.
*/
public interface FunctionDao {

    int insert(Function function);

    int delete(Function function);

    int deletes(@Param("ids") Integer[] ids);

    int update(Function function);

    List<Function> select(Function function);
}