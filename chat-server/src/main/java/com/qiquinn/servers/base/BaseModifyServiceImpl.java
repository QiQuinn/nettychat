package com.qiquinn.servers.base;


import com.qiquinn.dao.AroiseChatFriendMapper;
import com.qiquinn.dao.AroiseChatMessageMapper;
import com.qiquinn.dao.AroiseChatUserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseModifyServiceImpl<T> implements BaseInitailService<T>,BaseModifyService<T>
{
    @Autowired
    public AroiseChatUserMapper aroiseChatUserMapper;
    @Autowired
    public AroiseChatFriendMapper aroiseChatFriendMapper;
    @Autowired
    public AroiseChatMessageMapper aroiseChatMessageMapper;
}