package com.lml.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Administrator
 * @date 2020/3/20 12:37
 * Description:
 */
public class DemoTest {

    public static void main(String[] args) {
        Integer[] arr = {1,2,2,4,5,6};
        printMinNums2(arr,3);
    }

    /**
     * 力扣  最小的k个数
     * https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
     * @param arr 数组
     * @param k 个数
     */
    static void printMinNums(Integer[] arr, int k){
        List<Integer> list = Arrays.asList(arr);
        //排序->限制个数->转字符串->拼接
        String result = list.stream().sorted().limit(k).map(String::valueOf).
                collect(Collectors.joining(",","[","]"));
        System.out.println(result);
    }

    static void printMinNums2(Integer[] arr, int k){
        List<Integer> list = Arrays.asList(arr);
        list.sort((x1,x2) -> x1-x2);
        List<Integer> list1 = list.subList(0, k);
        System.out.println(list1);
    }

    public static Integer[] minNums(Integer[] arr, int k){
        List<Integer> list = Arrays.asList(arr);
        List<Integer> resultList = list.stream().sorted().limit(k).collect(Collectors.toList());
        return resultList.toArray(new Integer[k]);
    }



}
