package cc.buckler.dnf.utils.result;

/**
 * @Author: buckler
 * @Date: 2022/7/12 17:31
 * @Describe: 结果枚举类
 */
public enum ResultCodeEnum {
    /**
     * 通用部分 100 - 599
     */
    // 成功请求
    SUCCESS(200, "success"),
    //重定向
    REDIRECT(301, "redirect"),
    //资源未找到
    NOT_FOUND(404, "not found"),
    //服务器错误
    SERVER_ERROR(500, "server error"),

    /**
     * 这里可以根据不同模块用不同的区级分开错误码，例如：
     * 1000～1999 区间表示用户模块错误
     * 2000～2999 区间表示订单模块错误
     */
    //登录错误
    LOGIN_ERROR(1500, "login failure"),
    //充值错误
    CASH_ERROR(1501, "cash error"),
    CHARACTER_NOT_FOUND(1502, "character not found"),
    FINISH_QUEST_FAILURE(1053, "finish quest failure"),
    OPEN_MAP_FAILURE(1054, "open map failure"),
    CLEAR_PACK_FAILURE(1055, "clear pack failure"),
    CLEAR_FASHION_FAILURE(1056, "clear fashion failure");

    /**
     * 响应状态码
     */
    private int code;
    /**
     * 响应信息
     */
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    ResultCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
