package com.qiquinn.servers.base;

/**
 * @Author:QiQuinn
 * @Desicription:
 * @Date:Created in 2019/8/9
 * @Modified By:
 */

public interface BaseModifyService<T>
{
    void update(T t);
    void delete(T t);
}
