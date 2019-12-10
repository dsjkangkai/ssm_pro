package com.kk.service.impl;

import com.kk.service.RoleService;
import com.kk.dao.RoleDao;
import com.kk.po.RolePo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

/**
* Created by kk on 2019-12-10.
*/
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleDao roleDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int insert(RolePo role){
        return roleDao.insert(role);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int delete(RolePo role){
        return roleDao.delete(role);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int deletes(Integer[] ids) {
        return  roleDao.deletes(ids);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int update(RolePo role){
        return roleDao.update(role);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public List<RolePo> select(Map<String,Object> map){
        return roleDao.select(map);
    }

}