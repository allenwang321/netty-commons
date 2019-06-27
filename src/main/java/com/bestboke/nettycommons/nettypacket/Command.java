package com.bestboke.nettycommons.nettypacket;

public interface Command {

    // 登录请求
    Byte LOGIN_REQUEST = 1;

    // 登录回调
    Byte LOGIN_RESPONSE = 2;

    // 发送消息
    Byte MESSAGE_REQUEST = 3;

    // 消息回调
    Byte MESSAGE_RESPONSE = 4;

}
