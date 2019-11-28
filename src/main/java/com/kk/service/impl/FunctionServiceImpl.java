package com.kk.service.impl;

import com.kk.dao.FunctionDao;
import com.kk.po.Function;
import com.kk.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
* Created by ZTCGenerator<zingon@aliyun.com> on 2019-11-28.
*/
@Service
public class FunctionServiceImpl implements FunctionService {

    @Autowired
    FunctionDao functionDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int insert(Function function){
        return functionDao.insert(function);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int delete(Function function){
        return functionDao.delete(function);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int deletes(Integer[] ids) {
        return  functionDao.deletes(ids);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int update(Function function){
        return functionDao.update(function);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public List<Function> select(Function function){
        return functionDao.select(function);
    }

}