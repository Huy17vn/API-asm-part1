package com.huyvn.util;

public class JsonResponse {
    private int status;
    private String message;
    private Object data;
    public int getStatus() {
        return status;
    }

    public JsonResponse setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public JsonResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public JsonResponse setData(Object data) {
        this.data = data;
        return this;
    }

}
