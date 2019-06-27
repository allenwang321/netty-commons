package com.bestboke.nettycommons.nettypacket.request;

import com.bestboke.nettycommons.nettypacket.Command;
import com.bestboke.nettycommons.nettypacket.Packet;

public class MessageRequestPacket extends Packet {

    private String message;

    @Override
    public Byte getCommand() {
        return Command.MESSAGE_REQUEST;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
