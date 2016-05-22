package org.seckill.entity;

import java.util.Date;

/**
 * @author gongchunru
 * @Package org.seckill.entity
 * @date 16/5/18 21:29
 */
public class SuccessKilled {

    private long seckillId;

    private long userPhone;

    private short state;

    private Date createTime;
    //变通
    //多对一
    private Seckill seckill;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "createTime=" + createTime +
                ", seckillId=" + seckillId +
                ", userPhone=" + userPhone +
                ", state=" + state +
                '}';
    }
}
