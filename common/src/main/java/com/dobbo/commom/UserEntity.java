package com.dobbo.commom;

import java.io.Serializable;

/**用户实体类*/
public class UserEntity implements Serializable {

    private int id;
    private String username;
    private String nickname;
    private String loginpwd;
    private String icon;
    private String telnumber;
    private String mail;
    private String wechat;
    private int loginstate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public int getLoginstate() {
        return loginstate;
    }

    public void setLoginstate(int loginstate) {
        this.loginstate = loginstate;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", loginpwd='" + loginpwd + '\'' +
                ", icon='" + icon + '\'' +
                ", telnumber='" + telnumber + '\'' +
                ", mail='" + mail + '\'' +
                ", wechat='" + wechat + '\'' +
                ", loginstate=" + loginstate +
                '}';
    }
}
