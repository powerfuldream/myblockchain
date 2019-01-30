package com.mindata.blockchain.socket.distruptor.base;

/**
 * @author zhang wrote on 2018/4/20.
 */
public interface MessageConsumer {
    void receive(BaseEvent baseEvent) throws Exception;
}
