package com.kk.util;

import com.kk.po.UserPo;
import com.kk.util.constant.ConstantShiro;
import org.apache.shiro.SecurityUtils;

public class ShiroUtils {

    public static UserPo getSessionUser() {
        return (UserPo) SecurityUtils.getSubject().getSession().getAttribute(ConstantShiro.SESSION_USER);
    }

    public static void setSessionUser(Object user) {
        SecurityUtils.getSubject().getSession().setAttribute(ConstantShiro.SESSION_USER, user);
    }

}
