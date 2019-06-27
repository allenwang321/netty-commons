package com.bestboke.nettycommons.nettypacket.response;

import com.bestboke.nettycommons.nettypacket.Command;
import com.bestboke.nettycommons.nettypacket.Packet;

public class MessageResponsePacket extends Packet {

    private String message;

    @Override
    public Byte getCommand() {
        return Command.MESSAGE_RESPONSE;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
