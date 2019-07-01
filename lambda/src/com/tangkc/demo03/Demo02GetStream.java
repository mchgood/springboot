package com.tangkc.demo03;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Auther: lenovo
 * @Date: 2019-05-12 20:54
 * @Description:
 * 获取流
 */
public class Demo02GetStream {
    public static void main(String[] args) {
        //lit
        List<String> list = new ArrayList<>();
        Stream<String> streamList = list.stream();

        //set
        Set<String> set = new HashSet<>();
        Stream<String> streamSet = set.stream();

        //map
        Map<String,String> map = new HashMap<>();
        //键
        Set<String> keyMap = map.keySet();
        Stream<String> streamKeyMap = keyMap.stream();
        //值
        Collection<String> valuesMap = map.values();
        Stream<String> streamValueMap = valuesMap.stream();
        //键值对
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Stream<Map.Entry<String, String>> streamKeyValueMap = entrySet.stream();

        //数组
        Integer[] arr = {1,2,3,4};
        Stream<Integer> streamArr= Stream.of(arr);
    }
}
