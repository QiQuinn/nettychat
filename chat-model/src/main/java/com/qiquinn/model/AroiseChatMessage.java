package com.qiquinn.model;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "aroise_chat_message")
public class AroiseChatMessage {
    @Id
    private Integer id;
    /**
     * 发送者
     * */
    private Integer messageSenderId;
    /**
     * 接收者
     * */
    private Integer messageAccepterId;
    /**
     * 消息
     * */
    private String message;
    /**
     * 消息一读状态
     * */
    private String messageSginFlag;
    /**
     * 创建时间
     * */
    private String createTime;

    public AroiseChatMessage(){}
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public void setMessageSenderId(Integer messageSenderId) {
        this.messageSenderId = messageSenderId;
    }
    public Integer getMessageSenderId() {
        return messageSenderId;
    }
    public void setMessageAccepterId(Integer messageAccepterId) {
        this.messageAccepterId = messageAccepterId;
    }
    public Integer getMessageAccepterId() {
        return messageAccepterId;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public void setMessageSginFlag(String messageSginFlag) {
        this.messageSginFlag = messageSginFlag;
    }
    public String getMessageSginFlag() {
        return messageSginFlag;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public String getCreateTime() {
        return createTime;
    }
}