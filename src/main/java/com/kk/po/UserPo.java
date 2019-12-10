package com.kk.po;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

/**
* Created by kk on 2019-12-10.
*/
public class UserPo implements Serializable{
        // 主键
        private Integer id;
        // 
        private String name;
        // 
        private String password;
        // 
        private Integer roleType;
        // 
        private Date createTime;
        // 
        private Integer deleteFlag;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
        public Integer getRoleType() {
            return roleType;
        }

        public void setRoleType(Integer roleType) {
            this.roleType = roleType;
        }
        public Date getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Date createTime) {
            this.createTime = createTime;
        }
        public Integer getDeleteFlag() {
            return deleteFlag;
        }

        public void setDeleteFlag(Integer deleteFlag) {
            this.deleteFlag = deleteFlag;
        }
}
