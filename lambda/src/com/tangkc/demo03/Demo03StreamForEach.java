package com.tangkc.demo03;

import java.util.stream.Stream;

/**
 * @Auther: lenovo
 * @Date: 2019-05-12 21:09
 * @Description:
 */
public class Demo03StreamForEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3");
        stream.forEach((String num)->{
            System.out.println(num);
        });
    }
}
