package com.qiquinn.servers.user;

import java.util.List;

import com.qiquinn.model.AroiseChatUser;
import com.qiquinn.model.result.RequestResult;
import com.qiquinn.servers.base.BaseModifyServiceImpl;
import com.qiquinn.utils.MD5Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("userService")
public class AroiseChatUserModifyServiceImpl extends BaseModifyServiceImpl<AroiseChatUser> implements AroiseChatUserService
{
    private Logger logger = LoggerFactory.getLogger(AroiseChatUserModifyServiceImpl.class);
    @Override
    public void insert(AroiseChatUser user) {
        aroiseChatUserMapper.insert(user);
    }
    @Override
    public void delete(AroiseChatUser user) {
        aroiseChatUserMapper.delete(user);
    }
    @Override
    public void update(AroiseChatUser user) {
        aroiseChatUserMapper.update(user);
    }
    @Override
    public List<AroiseChatUser> select() {
        return aroiseChatUserMapper.select();
    }
    @Override
    public AroiseChatUser byIdSelect(Integer id) {
        return aroiseChatUserMapper.byIdSelect(id);
    }

    @Override
    public RequestResult login(String username, String password)
    {
        AroiseChatUser user = aroiseChatUserMapper.findUserByName(username);
        if(user==null)
            return new RequestResult(-1,"用户名密码错误!");
        else
        {
            if(user.getUserPassword().equals(password) && user.getUserName().equals(username))
                return new RequestResult(200,"登陆成功",user);
            else
                return new RequestResult(-1,"用户名密码错误",null);
        }

    }
    @Override
    public RequestResult logout(AroiseChatUser user) {
        return null;
    }
    @Override
    public RequestResult modifyUserData(AroiseChatUser user) {
        return null;
    }

    @Override
    public RequestResult register(AroiseChatUser user)
    {
        try {
//            String md5Password = MD5Utils.getMD5Str(user.getUserPassword());
//            user.setUserPassword(md5Password);
            aroiseChatUserMapper.insert(user);
            return new RequestResult(200,"注册成功");
        } catch (Exception e) {
            logger.error("MD5加密错误",e);
            return new RequestResult(-1,"MD5加密错误",e);
        }
    }
}