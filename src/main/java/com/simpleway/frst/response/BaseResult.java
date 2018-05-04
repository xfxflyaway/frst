package com.simpleway.frst.response;

/**
 * @author xiongfeixiang
 * @title BaseResult
 * @date 2017/10/10 17:14
 * @since v1.0.0
 */
public class BaseResult {
    /**
     * 请求结果 true 成功  false失败
     */
    protected boolean flag;

    protected String msg = "success";

    /**
     * 返回码 1成功 0失败
     */
    protected int code;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
