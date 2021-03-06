package com.shxp.harbor.exception;


import com.shxp.harbor.response.ResponseEnum;

public class HarborException extends RuntimeException {

    private static final long serialVersionUID = -5997015471659213563L;
    private String code;
    private String msg;
    private ResponseEnum response;

    public HarborException(ResponseEnum response) {
        super(response.getMsg());
        this.code = response.getCode();
        this.msg = response.getMsg();
        this.response = response;
    }

    public HarborException(ResponseEnum response, Throwable e) {
        super(e);
        this.code = response.getCode();
        this.msg = response.getMsg();
        this.response = response;
    }

    public HarborException(ResponseEnum response, String extData) {
        super(response.getMsg());
        this.code = response.getCode();
        this.msg = response.getMsg() + "|" + extData;
        this.response = response;
    }

    public HarborException(String extData) {
        super(ResponseEnum.ERROR.getMsg());
        this.code = ResponseEnum.ERROR.getCode();
        this.msg = ResponseEnum.ERROR.getMsg() + "|" + extData;
        this.response = ResponseEnum.ERROR;
    }

    public ResponseEnum getResponse() {
        return this.response;
    }

    public void setResponse(ResponseEnum response) {
        this.response = response;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
