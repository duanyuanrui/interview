package com.douyin.other;

public class JinZhi {
    public String fun(int n , int hex ){
        if(n<hex){
            return String.valueOf(n);
        }else{
            int a = n/hex;
            int b = n%hex;
            return fun(a,hex)+b;
        }
    }

    public String fun2(int n , int hex){
        int a = n/hex;
        int b = n%hex;
        while(a!=0){
            return fun(a,hex)+b;
        }
        return String.valueOf(a);
    }
}
