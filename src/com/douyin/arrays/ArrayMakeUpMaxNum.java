package com.douyin.arrays;

import java.util.Arrays;

public class ArrayMakeUpMaxNum {

    public String fun(int arr[]){
        //字符串组成的最大数字。
        String[] strArray = new String[arr.length];
        for(int i = 0;i<arr.length;i++){
            strArray[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(strArray,(a,b)->(b+a).compareTo(a+b));
        StringBuffer stringBuffer = new StringBuffer();
        for(int j = 0 ;j<strArray.length;j++){
            stringBuffer.append(strArray[j]);
        }
        return (stringBuffer.charAt(0)==0 ? "0" : stringBuffer.toString());
    }
}
