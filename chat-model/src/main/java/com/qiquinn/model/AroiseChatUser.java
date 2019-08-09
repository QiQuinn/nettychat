package com.qiquinn.model;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "aroise_chat_user")
public class AroiseChatUser {
    /**
     * 自增ID
     */
    @Id
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 密码
     */
    @Column(name = "user_password")
    private String userPassword;

    /**
     * 昵称
     */
    @Column(name = "user_nikename")
    private String userNikename;

    /**
     * 年龄
     */
    @Column(name = "user_age")
    private Integer userAge;

    /**
     * 性别
     */
    @Column(name = "user_gender")
    private Integer userGender;

    /**
     * 个性签名
     */
    @Column(name = "user_individual")
    private String userIndividual;

    /**
     * 用户二维码
     */
    @Column(name = "user_qrcode")
    private String userQrcode;

    /**
     * clientId
     */
    @Column(name = "user_cid")
    private String userCid;

    /**
     * 获取自增ID
     *
     * @return id - 自增ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自增ID
     *
     * @param id 自增ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return user_password - 密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置密码
     *
     * @param userPassword 密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取昵称
     *
     * @return user_nikename - 昵称
     */
    public String getUserNikename() {
        return userNikename;
    }

    /**
     * 设置昵称
     *
     * @param userNikename 昵称
     */
    public void setUserNikename(String userNikename) {
        this.userNikename = userNikename;
    }

    /**
     * 获取年龄
     *
     * @return user_age - 年龄
     */
    public Integer getUserAge() {
        return userAge;
    }

    /**
     * 设置年龄
     *
     * @param userAge 年龄
     */
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    /**
     * 获取性别
     *
     * @return user_gender - 性别
     */
    public Integer getUserGender() {
        return userGender;
    }

    /**
     * 设置性别
     *
     * @param userGender 性别
     */
    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    /**
     * 获取个性签名
     *
     * @return user_individual - 个性签名
     */
    public String getUserIndividual() {
        return userIndividual;
    }

    /**
     * 设置个性签名
     *
     * @param userIndividual 个性签名
     */
    public void setUserIndividual(String userIndividual) {
        this.userIndividual = userIndividual;
    }

    /**
     * 获取用户二维码
     *
     * @return user_qrcode - 用户二维码
     */
    public String getUserQrcode() {
        return userQrcode;
    }

    /**
     * 设置用户二维码
     *
     * @param userQrcode 用户二维码
     */
    public void setUserQrcode(String userQrcode) {
        this.userQrcode = userQrcode;
    }

    /**
     * 获取clientId
     *
     * @return user_cid - clientId
     */
    public String getUserCid() {
        return userCid;
    }

    /**
     * 设置clientId
     *
     * @param userCid clientId
     */
    public void setUserCid(String userCid) {
        this.userCid = userCid;
    }
}