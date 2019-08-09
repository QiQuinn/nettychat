package com.qiquinn.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "aroise_chat_friend")
public class AroiseChatFriend {
    @Id
    private Integer id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "friend_id")
    private String friendId;

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
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return friend_id
     */
    public String getFriendId() {
        return friendId;
    }

    /**
     * @param friendId
     */
    public void setFriendId(String friendId) {
        this.friendId = friendId;
    }
}