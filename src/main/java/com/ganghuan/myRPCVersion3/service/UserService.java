package com.ganghuan.myRPCVersion3.service;


import com.ganghuan.myRPCVersion3.common.User;
import io.netty.channel.ChannelFuture;

public interface UserService {
    // 客户端通过这个接口调用服务端的实现类
    ChannelFuture getUserByUserId(Integer id);

    Integer insertUserId(User user);
}
