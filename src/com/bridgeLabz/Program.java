package com.bridgeLabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Program{
    public static void main(String args[]){

        List<Integer> nums = Arrays.asList(5, 45,23,56,55);
        Program pr = new Program();
        pr.seperateBy5(nums);
    }

    public void seperateBy5(List<Integer> nums){
        ArrayList<Integer> sepNum = new ArrayList<>();

        for(int num:nums){
            if(num%5==0)
                sepNum.add(num);
        }

        int size = sepNum.size();
        int [] arr1 = new int[size];
        int i=0;
        for(Integer number : sepNum){
            arr1[i] = number;
            i++;
        }

        for(Integer showNum: arr1){
            System.out.print(showNum+" ");
        }
        System.out.println();

        Collections.sort(nums);
        for (int num: nums)
            System.out.print(num+" ");

        System.out.println();

        nums.stream()
                .filter(n ->n%5 !=0)
                .forEach(System.out::println);
    }
}
