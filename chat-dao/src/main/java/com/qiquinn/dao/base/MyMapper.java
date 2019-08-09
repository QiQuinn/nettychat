package com.qiquinn.dao.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

/**
 * @Author:QiQuinn
 * @Desicription:
 * @Date:Created in 2019/8/8
 * @Modified By:
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    //TODO
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
    @Override
    int updateByPrimaryKey(T t);
    @Override
    int selectCount(T t);
    @Override
    List<T> select(T t);
    T selectById(Integer id);
    @Override
    T selectOne(T t);
    void deleteById(Integer id);
}
