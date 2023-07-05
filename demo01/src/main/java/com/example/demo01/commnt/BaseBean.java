package com.example.demo01.commnt;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

/**
 * BaseBean
 * com.example.demo01.commnt
 *
 * @author wang
 * @date 2023/7/5 21:09
 */

@Data
public class BaseBean<T> {
    private String stat;
    private boolean success;
    private T message;

    private BaseBean(String stat, boolean success, T message) {
        this.stat = stat;
        this.success = success;
        this.message = message;
    }
    public static <T>BaseBean<T> success(String stat){
        return new BaseBean<>(stat,true,null);
    }
    public static <T>BaseBean<T> success(String stat,T data){
        return new BaseBean<>(stat,true,data);
    }
    public static <T>BaseBean<T> fail(String stat){
        return new BaseBean<>(stat,true,null);
    }
    public static <T>BaseBean<T> fail(String stat,T data){
        return new BaseBean<>(stat,true,data);
    }
}
