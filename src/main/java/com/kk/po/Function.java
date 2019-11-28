package com.kk.po;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

/**
* Created by ZTCGenerator<zingon@aliyun.com> on 2019-11-28.
*/
public class Function implements Serializable{
        // 主键
        private Integer id;
        // 父级id 根节点则为0
        private Integer pid;
        // 
        private String pattern;
        // 链接
        private String url;
        // 图标
        private String icon;
        // 名称
        private String name;
        // 描述
        private String discription;
        // 类型 1菜单 2按钮 
        private Integer type;
        // 排序值
        private Integer sortnum;
        // 删除标记  1是  2否
        private Integer delFlag;
        // 创建时间
        private Date createTime;

        public Integer getId() {
            return id;
        }

        public Function setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getPid() {
            return pid;
        }

        public Function setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public String getPattern() {
            return pattern;
        }

        public Function setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getUrl() {
            return url;
        }

        public Function setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getIcon() {
            return icon;
        }

        public Function setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getName() {
            return name;
        }

        public Function setName(String name) {
            this.name = name;
            return this;
        }
        public String getDiscription() {
            return discription;
        }

        public Function setDiscription(String discription) {
            this.discription = discription;
            return this;
        }
        public Integer getType() {
            return type;
        }

        public Function setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getSortnum() {
            return sortnum;
        }

        public Function setSortnum(Integer sortnum) {
            this.sortnum = sortnum;
            return this;
        }
        public Integer getDelFlag() {
            return delFlag;
        }

        public Function setDelFlag(Integer delFlag) {
            this.delFlag = delFlag;
            return this;
        }
        public Date getCreateTime() {
            return createTime;
        }

        public Function setCreateTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }
}
