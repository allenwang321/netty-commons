package com.bestboke.nettycommons.nettypacket.response;

import com.bestboke.nettycommons.nettypacket.Command;
import com.bestboke.nettycommons.nettypacket.Packet;

public class LoginResponsePacket  extends Packet {

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {
        return Command.LOGIN_RESPONSE;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
