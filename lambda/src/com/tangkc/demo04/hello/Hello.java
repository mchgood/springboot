package com.tangkc.demo04.hello;

/**
 * @Auther: lenovo
 * @Date: 2019-05-14 21:58
 * @Description:
 */
public class Hello {

    public static void method(Print p){
        p.method("hello");
    }

    public static void main(String[] args) {
        //常用方式
        method((String str)->{
            UperCase up = new UperCase();
            up.print(str);
        });

        //方法引用
        UperCase up = new UperCase();
        method(up::print);
    }
}
