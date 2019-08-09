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
     */
    @Column(name = "message_sender_user_id")
    private Integer messageSenderUserId;

    /**
     * 接收者
     */
    @Column(name = "message_accept_user_id")
    private Integer messageAcceptUserId;

    /**
     * 消息
     */
    private String message;

    /**
     * 消息一读状态
     */
    @Column(name = "message_sgin_flag")
    private Integer messageSginFlag;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取发送者
     *
     * @return message_sender_user_id - 发送者
     */
    public Integer getMessageSenderUserId() {
        return messageSenderUserId;
    }

    /**
     * 设置发送者
     *
     * @param messageSenderUserId 发送者
     */
    public void setMessageSenderUserId(Integer messageSenderUserId) {
        this.messageSenderUserId = messageSenderUserId;
    }

    /**
     * 获取接收者
     *
     * @return message_accept_user_id - 接收者
     */
    public Integer getMessageAcceptUserId() {
        return messageAcceptUserId;
    }

    /**
     * 设置接收者
     *
     * @param messageAcceptUserId 接收者
     */
    public void setMessageAcceptUserId(Integer messageAcceptUserId) {
        this.messageAcceptUserId = messageAcceptUserId;
    }

    /**
     * 获取消息
     *
     * @return message - 消息
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置消息
     *
     * @param message 消息
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 获取消息一读状态
     *
     * @return message_sgin_flag - 消息一读状态
     */
    public Integer getMessageSginFlag() {
        return messageSginFlag;
    }

    /**
     * 设置消息一读状态
     *
     * @param messageSginFlag 消息一读状态
     */
    public void setMessageSginFlag(Integer messageSginFlag) {
        this.messageSginFlag = messageSginFlag;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}