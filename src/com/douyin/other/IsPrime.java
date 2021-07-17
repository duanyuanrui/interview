package com.douyin.other;

public class IsPrime {
    //素数
    public boolean isPrime(){
        int num =49;
        for(int i =2;i<num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
