package com.tangkc.demo03;

import java.util.stream.Stream;

/**
 * @Auther: lenovo
 * @Date: 2019-05-12 21:13
 * @Description:
 */
public class Demo05StreamMap {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3");
        stream.map((String num)->{
            return Integer.valueOf(num);
        }).forEach((Integer num)->{
            System.out.println(num);
        });
    }
}
