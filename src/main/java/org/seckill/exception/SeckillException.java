package org.seckill.exception;

/**
 * @author gongchunru
 * @Package org.seckill.exception
 * @date 16/5/21 00:51
 */
public class SeckillException extends RuntimeException{
    public SeckillException(String message) {
        super(message);
    }
    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
