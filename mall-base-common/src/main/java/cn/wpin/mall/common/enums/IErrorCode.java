package cn.wpin.mall.common.enums;

/**
 * 封装API的错误码
 * @author wangpin
 */
public interface IErrorCode {

    /**
     * 错误编码
     * @return
     */
    long getCode();

    /**
     * 错误信息
     * @return
     */
    String getMessage();
}
