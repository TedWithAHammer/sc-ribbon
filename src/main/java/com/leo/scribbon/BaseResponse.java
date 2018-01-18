package com.leo.scribbon;

/**
 * Created by leo on 2018/1/17.
 * Description:
 */
public class BaseResponse {
    public static BaseResponse OK = new BaseResponse(0, "success");
    public static BaseResponse FAIL = new BaseResponse(400, "fail");

    private Integer code;
    private String msg;

    public BaseResponse() {
    }

    public BaseResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
