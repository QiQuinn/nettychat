package com.qiquinn.model.result;

/**
 * @Author:QiQuinn
 * @Desicription: 返回请求的实体
 * @Date:Created in 2019/8/8
 * @Modified By:
 */
public class RequestResult
{
    private Integer code;
    private String message;
    private Object obj;

    public RequestResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public RequestResult(Integer code, String message, Object obj) {
        this.code = code;
        this.message = message;
        this.obj = obj;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
