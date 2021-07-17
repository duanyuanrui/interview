package com.douyin.arrays;

public class GetSecond {
    public void getSecond(int arr[]){
        int max = arr[0];
        int second = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length ; i++){
            if(arr[i]>max){
                second = max;
                max = arr[i];
            }else{
                if(arr[i]<second){
                    second = arr[i];
                }
            }
        }
        System.out.println("次大值是===="+second);
    }
}
