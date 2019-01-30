package com.mindata.blockchain.socket.distruptor.base;

/**
 * @author zhang wrote on 2018/4/20.
 */
public interface MessageProducer {
    void publish(BaseEvent baseEvent);
}
