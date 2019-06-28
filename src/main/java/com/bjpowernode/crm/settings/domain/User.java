package com.bjpowernode.crm.settings.domain;

/**
 * Author:
 */
public class User {
        /*
        * 关于登录：
        * 需要验证账号和密码是否正确
        * User user = select * from tbl_student where loginAct=? and loginPwd=?
        * 判断：如果user为null，说明账号密码不正确
        * 如果user不为null，说明账号密码是正确的
        *一旦账号密码正确，我们需要从user对象中去除其他相关信息，进行进一步验证
        *
        * expireTime 。验证失效时间
        * lockState  验证锁定状态  0表示锁定  1表示启用
        * allowIps  验证IP地址
        *
        *
        * 关于时间，
        * 在实际开发中，使用字符串表示时间，有一定的预定俗成的规则
        * 日期： yyyy-MM-dd   10位
        * 时间： yyyy-MM-dd HH:mm:ss  19位
        *
        **/


    private String id; //主键
    private String loginAct; //登录账号
    private String name; // 用户的真实姓名
    private String loginPwd; //登录密码
    private String email; // 邮箱
    private String expireTime; //失效时间  yyyy-MM-dd HH:mm:ss  19位
    private String lockState; //锁定状态
    private String deptno; //部门编号
    private String allowIps; //允许访问的IP地址群
    private String createTime; //创建时间  yyyy-MM-dd HH:mm:ss  19位
    private String createBy; //创建人
    private String editTime; //修改时间   yyyy-MM-dd HH:mm:ss  19位
    private String editBy; //修改人

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginAct() {
        return loginAct;
    }

    public void setLoginAct(String loginAct) {
        this.loginAct = loginAct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getLockState() {
        return lockState;
    }

    public void setLockState(String lockState) {
        this.lockState = lockState;
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getAllowIps() {
        return allowIps;
    }

    public void setAllowIps(String allowIps) {
        this.allowIps = allowIps;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public String getEditBy() {
        return editBy;
    }

    public void setEditBy(String editBy) {
        this.editBy = editBy;
    }
}
