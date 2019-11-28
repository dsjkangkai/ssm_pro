package com.kk.util;

import com.kk.po.User;
import com.kk.util.constant.ConstantShiro;
import org.apache.shiro.SecurityUtils;

public class ShiroUtils {

    public static User getSessionUser() {
        return (User) SecurityUtils.getSubject().getSession().getAttribute(ConstantShiro.SESSION_USER);
    }

    public static void setSessionUser(Object user) {
        SecurityUtils.getSubject().getSession().setAttribute(ConstantShiro.SESSION_USER, user);
    }

}
