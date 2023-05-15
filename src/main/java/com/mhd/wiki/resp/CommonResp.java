package com.mhd.wiki.resp;

/**
 * @author 莫寒鼎
 * @version 1.0
 * @date 2023/5/15 16:50
 */
public class CommonResp<T> {
    /*
    业务上的成功或者失败
     */
    private boolean success = true;
    /*
    返回信息
     */
    private String message;
    /*
    返回泛型数据，自定义类型
     */
    private T content;
    public boolean getSuccess(){
        return success;
    }
    public void setSuccess(boolean success){
        this.success=success;
    }
    public String getMessage(){
        return message;
    }

    public void setContent(T content) {
        this.content = content;
    }
    public T getContent() {
        return content;
    }
}
