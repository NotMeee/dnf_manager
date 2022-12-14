package cc.buckler.dnf.utils.result;

import java.io.Serializable;

/**
 * @Author: buckler
 * @Date: 2022/7/12 17:39
 * @Describe: 统一结果类
 */
public class HttpResult<T> implements Serializable {
    /**
     * 是否响应成功
     */
    private boolean success;
    /**
     * 响应状态码
     */
    private int code;
    /**
     * 响应数据
     */
    private T data;
    /**
     * 错误信息
     */
    private String message;

    /**
     * 无参构造器（构造器私有，外部不可以直接创建）
     */
    private HttpResult() {
        this.code = 200;
        this.success = true;
    }

    /**
     * 有参构造器
     *
     * @param obj
     */
    private HttpResult(T obj) {
        this.code = 200;
        this.data = obj;
        this.success = true;
    }

    /**
     * 有参构造器
     *
     * @param resultCode 响应状态码
     */
    private HttpResult(ResultCodeEnum resultCode) {
        this.success = false;
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    /**
     * 通用返回成功（没有返回结果）
     *
     * @param <T>
     * @return
     */
    public static <T> HttpResult<T> success() {
        return new HttpResult();
    }

    /**
     * 返回成功（有返回结果）
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> HttpResult<T> success(T data) {
        return new HttpResult<T>(data);
    }

    /**
     * 通用返回失败
     *
     * @param resultCode
     * @param <T>
     * @return
     */
    public static <T> HttpResult<T> failure(ResultCodeEnum resultCode) {
        return new HttpResult<T>(resultCode);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HttpResult{" +
                "success=" + success +
                ", code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
