package cn.wpin.mall.common.enums;

/**
 * 枚举的getSet方法统一抽象
 * @author wangpin
 */
public interface CommonEnums {

    /**
     * 获取枚举下标
     * @return int
     */
    int getIndex();

    /**
     * 获取枚举描述
     * @return String
     */
    String getDesc();

    /**
     * 填充值
     * @param i index值
     */
    void setIndex(int i);

    /**
     * 填充描述
     * @param s 描述
     */
    void setDesc(String s);


}
