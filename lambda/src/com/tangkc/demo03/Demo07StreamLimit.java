package com.tangkc.demo03;

import java.util.stream.Stream;

/**
 * @Auther: lenovo
 * @Date: 2019-05-12 21:20
 * @Description:
 */
public class Demo07StreamLimit {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3");
        stream.limit(2).forEach((num)->{
            System.out.println(num);
        });
    }
}
