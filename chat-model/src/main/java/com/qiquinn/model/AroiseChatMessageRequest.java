package com.qiquinn.model;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "aroise_chat_message_request")
public class AroiseChatMessageRequest {
    @Id
    /**
     *
     * */
    private Integer id;
    /**
     * 发送者ID
     * */
    private Integer chatSendUserId;
    /**
     * 接收者iD
     * */
    private Integer chatAcceptUserId;
    /**
     * 请求时间
     * */
    private String chatRequestTime;

    public AroiseChatMessageRequest(){}
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
    public void setChatRequestTime(String chatRequestTime) {
        this.chatRequestTime = chatRequestTime;
    }
    public String getChatRequestTime() {
        return chatRequestTime;
    }
}