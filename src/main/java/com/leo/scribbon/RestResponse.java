package com.leo.scribbon;

/**
 * Created by leo on 2018/1/17.
 * Description:
 */
public class RestResponse<T> extends BaseResponse {

    private T data;

    public RestResponse() {
        super();
    }

    public RestResponse(T data) {
        super(0, "success");
        this.data = data;
    }

    public RestResponse(Integer code, String msg, T data) {
        super(code, msg);
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
