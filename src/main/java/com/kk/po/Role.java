package com.kk.po;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

/**
* Created by ZTCGenerator<zingon@aliyun.com> on 2019-11-28.
*/
public class Role implements Serializable{
        // 主键
        private Integer id;
        // 角色名称
        private String name;
        // 描述
        private String description;
        // 
        private String pattern;
        // 删除标记  1是 2否
        private Integer delFlag;
        // 排序
        private Integer sortnum;
        // 创建时间
        private Date createTime;

        public Integer getId() {
            return id;
        }

        public Role setId(Integer id) {
            this.id = id;
            return this;
        }
        public String getName() {
            return name;
        }

        public Role setName(String name) {
            this.name = name;
            return this;
        }
        public String getDescription() {
            return description;
        }

        public Role setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getPattern() {
            return pattern;
        }

        public Role setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public Integer getDelFlag() {
            return delFlag;
        }

        public Role setDelFlag(Integer delFlag) {
            this.delFlag = delFlag;
            return this;
        }
        public Integer getSortnum() {
            return sortnum;
        }

        public Role setSortnum(Integer sortnum) {
            this.sortnum = sortnum;
            return this;
        }
        public Date getCreateTime() {
            return createTime;
        }

        public Role setCreateTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }
}
