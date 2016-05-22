package org.seckill.dto;

/**
 * 所有ajax类型放回类型,封装json结果
 * @author gongchunru
 * @Package org.seckill.dto
 * @date 16/5/21 20:09
 */
public class SeckillResult<T> {

    private boolean success;

    private T data;

    private String error;


    public SeckillResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public SeckillResult(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
