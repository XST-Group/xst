package com.xst.entity;

import javax.persistence.*;

/**
 * Created by sl on 16-5-1.
 */
@Entity
@Table(name = "v9_admin", schema = "", catalog = "db_xst_new")
public class V9Admin {
    private int userid;
    private String username;
    private String password;
    private Short roleid;
    private String encrypt;
    private String lastloginip;
    private Integer lastlogintime;
    private String email;
    private String realname;
    private String card;
    private String lang;

    @Id
    @Column(name = "userid", nullable = false, insertable = true, updatable = true)
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "username", nullable = true, insertable = true, updatable = true, length = 20)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = true, insertable = true, updatable = true, length = 32)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "roleid", nullable = true, insertable = true, updatable = true)
    public Short getRoleid() {
        return roleid;
    }

    public void setRoleid(Short roleid) {
        this.roleid = roleid;
    }

    @Basic
    @Column(name = "encrypt", nullable = true, insertable = true, updatable = true, length = 6)
    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt;
    }

    @Basic
    @Column(name = "lastloginip", nullable = true, insertable = true, updatable = true, length = 15)
    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip;
    }

    @Basic
    @Column(name = "lastlogintime", nullable = true, insertable = true, updatable = true)
    public Integer getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Integer lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    @Basic
    @Column(name = "email", nullable = true, insertable = true, updatable = true, length = 40)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "realname", nullable = false, insertable = true, updatable = true, length = 50)
    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Basic
    @Column(name = "card", nullable = false, insertable = true, updatable = true, length = 255)
    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    @Basic
    @Column(name = "lang", nullable = false, insertable = true, updatable = true, length = 6)
    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        V9Admin admin = (V9Admin) o;

        if (userid != admin.userid) return false;
        if (username != null ? !username.equals(admin.username) : admin.username != null) return false;
        if (password != null ? !password.equals(admin.password) : admin.password != null) return false;
        if (roleid != null ? !roleid.equals(admin.roleid) : admin.roleid != null) return false;
        if (encrypt != null ? !encrypt.equals(admin.encrypt) : admin.encrypt != null) return false;
        if (lastloginip != null ? !lastloginip.equals(admin.lastloginip) : admin.lastloginip != null) return false;
        if (lastlogintime != null ? !lastlogintime.equals(admin.lastlogintime) : admin.lastlogintime != null)
            return false;
        if (email != null ? !email.equals(admin.email) : admin.email != null) return false;
        if (realname != null ? !realname.equals(admin.realname) : admin.realname != null) return false;
        if (card != null ? !card.equals(admin.card) : admin.card != null) return false;
        if (lang != null ? !lang.equals(admin.lang) : admin.lang != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (roleid != null ? roleid.hashCode() : 0);
        result = 31 * result + (encrypt != null ? encrypt.hashCode() : 0);
        result = 31 * result + (lastloginip != null ? lastloginip.hashCode() : 0);
        result = 31 * result + (lastlogintime != null ? lastlogintime.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (realname != null ? realname.hashCode() : 0);
        result = 31 * result + (card != null ? card.hashCode() : 0);
        result = 31 * result + (lang != null ? lang.hashCode() : 0);
        return result;
    }
}
