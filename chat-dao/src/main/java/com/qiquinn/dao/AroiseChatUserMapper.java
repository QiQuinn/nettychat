package com.qiquinn.dao;

import com.qiquinn.dao.base.BaseMapper;
import com.qiquinn.model.AroiseChatUser;

public interface AroiseChatUserMapper extends BaseMapper<AroiseChatUser>
{
    AroiseChatUser findUserByName(String userName);
}