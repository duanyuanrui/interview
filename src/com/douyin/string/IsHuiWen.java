package com.douyin.string;

public class IsHuiWen {
    //回文串
    public boolean isHuiWen(){
        String s = "qweewq";
        char arr[] = s.toCharArray();
        for(int i =0;i<arr.length/2;i++){
            if(arr[i]!=arr[arr.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
