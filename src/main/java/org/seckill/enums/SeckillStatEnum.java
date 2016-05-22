package org.seckill.enums;

/**
 * 使用枚举表述我们的常量数据
 * @author gongchunru
 * @Package org.seckill.enums
 * @date 16/5/21 02:30
 */
public enum SeckillStatEnum {
    SUCCESS(1,"秒杀成功"),
    END(0,"秒杀结束"),
    REPEAT_KILL(-1,"重复秒杀"),
    INNER_ERROR(-2,"内部错误"),
    DATA_REWRITE(-3,"数据篡改");



    private int state;

    private String stateInfo;

    SeckillStatEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public int getState() {
        return state;
    }

    public static SeckillStatEnum stateOf(int index){
        for (SeckillStatEnum state : values()){
            if (state.getState() == index){
                return state;
            }
        }
        return null;
    }
}
