package com.kk.service;

import com.kk.po.Function;

import java.util.List;

/**
* Created by ZTCGenerator<zingon@aliyun.com> on 2019-11-28.
*/
public interface FunctionService {

    int insert(Function function);

    int delete(Function function);

    int deletes(Integer[] ids);

    int update(Function function);

    List<Function> select(Function function);
}