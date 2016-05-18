package com.wanliang.site.domain.sys;

import com.wanliang.site.common.persistence.DataEntity;

public class Member extends DataEntity<Member> {

    private String username;
    private String nickname;
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}