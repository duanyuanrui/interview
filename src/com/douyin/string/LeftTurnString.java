package com.douyin.string;

public class LeftTurnString {
    public void leftTurnString(String s, int n){
        StringBuffer stringBuffer = new StringBuffer();
        if(s.isEmpty() || s.length()==0){
            System.out.println("空串");
        }
        if(n<0 || n>s.length()){
            System.out.println("位置有误");
        }
        String s1 = s.substring(n);
        String s2 = s.substring(0,n);
        stringBuffer.append(s1).append(s2);
        System.out.println(stringBuffer);

    }
}
