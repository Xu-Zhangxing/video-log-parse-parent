package com.zh.common.util;


import org.apache.http.client.methods.CloseableHttpResponse;

/**
 * @description: HttpClient响应内容封装
 * @author: zhouhao
 **/
public class ResponeVo {

    int code;

    CloseableHttpResponse response;

    String content;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public CloseableHttpResponse getResponse() {
        return response;
    }

    public void setResponse(CloseableHttpResponse response) {
        this.response = response;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
