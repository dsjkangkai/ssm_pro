package com.kk.po;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

/**
* Created by kk on 2019-12-10.
*/
public class RolePo implements Serializable{
        // 主键
        private Integer id;
        // 
        private String name;
        // 
        private String description;
        // 
        private String pattern;
        // 
        private Integer delFlag;
        // 
        private Integer sortnum;
        // 
        private Date createTime;

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
        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
        public String getPattern() {
            return pattern;
        }

        public void setPattern(String pattern) {
            this.pattern = pattern;
        }
        public Integer getDelFlag() {
            return delFlag;
        }

        public void setDelFlag(Integer delFlag) {
            this.delFlag = delFlag;
        }
        public Integer getSortnum() {
            return sortnum;
        }

        public void setSortnum(Integer sortnum) {
            this.sortnum = sortnum;
        }
        public Date getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Date createTime) {
            this.createTime = createTime;
        }
}
