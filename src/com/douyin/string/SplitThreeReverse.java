package com.douyin.string;

public class SplitThreeReverse {
    public String reverse(String s,int n){
        if(s.length()==0 || s.isEmpty()){
            return "";
        }
        if(s.length()==n){
            return new StringBuffer(s).reverse().toString();
        }
        StringBuffer stringBuffer = new StringBuffer();
        int start = 0;
        int end = n;
        while(start < s.length()){
            stringBuffer.append(new StringBuffer(s.substring(start,end)).reverse());
            start = end;
            end = start + n;
            if(end>s.length()){
                end = s.length();
            }else{
                end = start + n;
            }
        }
        return stringBuffer.toString();
    }
}
