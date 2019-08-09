package com.qiquinn.model;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "aroise_chat_user")
public class AroiseChatUser {
    /**
     *
     * */
    @Id
    private Integer id;
    /**
     * 用户名
     * */
    private String userName;
    /**
     * 密码
     * */
    private String userPassword;
    /**
     * 昵称
     * */
    private String userNikename;
    /**
     * 年龄
     * */
    private Integer userAge;
    /**
     * 性别
     * */
    private String userGender;
    /**
     * 个性签名
     * */
    private String userIndividua;
    /**
     * 用户二维码
     * */
    private String userQrcode;
    /**
     * clientId
     * */
    private String userCid;


    @Override
    public String toString() {
        return "AroiseChatUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userNikename='" + userNikename + '\'' +
                ", userAge=" + userAge +
                ", userGender='" + userGender + '\'' +
                ", userIndividua='" + userIndividua + '\'' +
                ", userQrcode='" + userQrcode + '\'' +
                ", userCid='" + userCid + '\'' +
                '}';
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserNikename(String userNikename) {
        this.userNikename = userNikename;
    }
    public String getUserNikename() {
        return userNikename;
    }
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
    public Integer getUserAge() {
        return userAge;
    }
    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }
    public String getUserGender() {
        return userGender;
    }
    public void setUserIndividua(String userIndividua) {
        this.userIndividua = userIndividua;
    }
    public String getUserIndividua() {
        return userIndividua;
    }
    public void setUserQrcode(String userQrcode) {
        this.userQrcode = userQrcode;
    }
    public String getUserQrcode() {
        return userQrcode;
    }
    public void setUserCid(String userCid) {
        this.userCid = userCid;
    }
    public String getUserCid() {
        return userCid;
    }
}