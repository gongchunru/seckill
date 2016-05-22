package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

/**
 * @author gongchunru
 * @Package org.seckill.dao
 * @date 16/5/18 21:36
 */
public interface SuccessKilledDao {
    /**
     * 插入购买明细,可过滤重复
     *
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    /**
     * 根据id查询SuccessKilled,并携带秒杀产品对象实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckilledId") long seckillId,@Param("userPhone") long userPhone);

}













