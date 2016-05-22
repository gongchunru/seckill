package org.seckill.exception;

/**
 * 秒杀关闭异常
 * @author gongchunru
 * @Package org.seckill.exception
 * @date 16/5/21 00:50
 */
public class SeckillCloseException extends SeckillException{
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
