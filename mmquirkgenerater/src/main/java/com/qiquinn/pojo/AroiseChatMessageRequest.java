package com.qiquinn.pojo;

import javax.persistence.*;

@Table(name = "aroise_chat_message_request")
public class AroiseChatMessageRequest {
    @Id
    private Integer id;

    @Column(name = "chat_send_user_id")
    private Integer chatSendUserId;

    @Column(name = "chat_accept_user_id")
    private Integer chatAcceptUserId;

    @Column(name = "chat_request_time")
    private String chatRequestTime;

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
     * @return chat_send_user_id
     */
    public Integer getChatSendUserId() {
        return chatSendUserId;
    }

    /**
     * @param chatSendUserId
     */
    public void setChatSendUserId(Integer chatSendUserId) {
        this.chatSendUserId = chatSendUserId;
    }

    /**
     * @return chat_accept_user_id
     */
    public Integer getChatAcceptUserId() {
        return chatAcceptUserId;
    }

    /**
     * @param chatAcceptUserId
     */
    public void setChatAcceptUserId(Integer chatAcceptUserId) {
        this.chatAcceptUserId = chatAcceptUserId;
    }

    /**
     * @return chat_request_time
     */
    public String getChatRequestTime() {
        return chatRequestTime;
    }

    /**
     * @param chatRequestTime
     */
    public void setChatRequestTime(String chatRequestTime) {
        this.chatRequestTime = chatRequestTime;
    }
}