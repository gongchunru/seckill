package org.seckill.exception;

/**
 * 重复秒杀一场,运行期异常
 * @author gongchunru
 * @Package org.seckill.exception
 * @date 16/5/21 00:48
 */
public class RepeatKillException extends SeckillException{
    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
