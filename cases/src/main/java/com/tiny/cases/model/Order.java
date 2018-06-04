package com.tiny.cases.model;

/**
 * @ClassName Order
 * @Description TODO
 * @Author Tiny
 * @Date 2018/6/4 14:50
 * @Version 1.0
 */
public class Order {
    private Long id;

    private Long userId;

    private String centent;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCentent() {
        return centent;
    }

    public void setCentent(String centent) {
        this.centent = centent;
    }
}
