package com.qiquinn.servers.base;

import com.qiquinn.dao.AroiseChatMessageRequestMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author:QiQuinn
 * @Desicription:
 * @Date:Created in 2019/8/9
 * @Modified By:
 */

public abstract class BaseInitailServiceImpl<T> implements BaseInitailService<T>
{
    @Autowired
    public AroiseChatMessageRequestMapper requestMapper;
}
