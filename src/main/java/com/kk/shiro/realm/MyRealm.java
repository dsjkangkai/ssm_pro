package com.kk.shiro.realm;

import com.kk.po.Function;
import com.kk.po.RolePo;
import com.kk.po.UserPo;
import com.kk.service.FunctionService;
import com.kk.service.RoleService;
import com.kk.service.UserService;
import com.kk.util.ShiroUtils;
import com.kk.util.constant.ConstantShiro;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Autowired
    private FunctionService functionService;

    @Autowired
    private RoleService roleService;


    /**
     * 授权查询回调函数, 进行鉴权当缓存中无用户的授权信息时调用.
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //初始化权限
        System.out.println(">>>>>>>>>>>执行权限获取<<<<<<<<<<<<");

        //获取登录时输入的用户名
        String username = (String) principalCollection.getPrimaryPrincipal();

        if (username != null) {
            //获取用户信息
            UserPo user = userService.getUserByName(username);

            //获取用户角色
            List<RolePo> roles = roleService.select(null);
            //获取权限列表
            List<Function> functionStrList = functionService.select(null);

            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

            if (roles != null && !roles.isEmpty()) {
                for (RolePo role : roles) {
                    info.addRole(role.getName());//加入角色
                }
            }

            if (functionStrList != null) {
                for (Function function : functionStrList) {
                    info.addStringPermission(function.getName());//加入权限
                }
            }

            //设置到shiro的session中
            SecurityUtils.getSubject().getSession().setAttribute(ConstantShiro.SHIRO_ROLES, roles);
            SecurityUtils.getSubject().getSession().setAttribute(ConstantShiro.SHIRO_FUNCTIONS, functionStrList);
            ShiroUtils.setSessionUser(user);

            return info;
        }
        return null;
    }

    /**
     * 认证回调函数,登录时调用.
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        //通过表单接收的用户名
        String username = token.getUsername();
        System.out.println("username:" + username);
        if (username != null && !"".equals(username)) {
            UserPo user = userService.getUserByName(username);
            if (user != null) {
                return new SimpleAuthenticationInfo(user.getName(), user.getPassword(), getName());
            }
        }
        System.out.println("认证失败");
        return null;
    }
}
