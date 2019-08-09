package com.qiquinn.model;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "aroise_chat_friend")
public class AroiseChatFriend {
    @Id
    private Integer id;
    /**
     * 添加者ID
     * */
    private Integer chatSendUserId;
    /**
     * 朋友ID
     * */
    private Integer chatAcceptUserId;
    /**
     * 昵称
     * */
    private String chatRequestTime;
    public AroiseChatFriend(){}
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public void setChatSendUserId(Integer chatSendUserId) {
        this.chatSendUserId = chatSendUserId;
    }
    public Integer getChatSendUserId() {
        return chatSendUserId;
    }
    public void setChatAcceptUserId(Integer chatAcceptUserId) {
        this.chatAcceptUserId = chatAcceptUserId;
    }
    public Integer getChatAcceptUserId() {
        return chatAcceptUserId;
    }
}