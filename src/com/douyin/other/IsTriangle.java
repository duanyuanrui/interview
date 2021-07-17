package com.douyin.other;

public class IsTriangle {
    //三角形
    public  boolean isTriangle(){
        int a=10;
        int b=20;
        int c=28;
        if(a+b>c && a+c>b && b+c>a){
            return true;
        }else {
            return false;
        }
    }
}
