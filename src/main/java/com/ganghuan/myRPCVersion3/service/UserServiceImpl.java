package com.ganghuan.myRPCVersion3.service;


import com.ganghuan.myRPCVersion3.common.User;
import com.ganghuan.myRPCVersion3.service.UserService;
import io.netty.channel.ChannelFuture;

public class UserServiceImpl implements UserService {
    @Override
    public ChannelFuture getUserByUserId(Integer id) {
//        // 模拟从数据库中取用户的行为
//        User user = User.builder().id(id).userName("he2121").sex(true).build();
//        System.out.println("客户端查询了"+id+"用户");
//       return user;
        return null;
    }

    @Override
    public Integer insertUserId(User user) {
        System.out.println("插入数据成功："+user);
        return 1;
    }
}
