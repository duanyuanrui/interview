package com.douyin.recurrence;

public class MatrixMN {
    public int  path(int m ,int n){
        if(m==1&&n==1){
            return 1;
        }
        if(m==1){
            return 1;
        }
        if(n==1){
           return 1;
        }
        return path(m,n-1)+path(m-1,n);
    }

    public int step(int m , int n){
        if(m==1&&n==1){
            return 1;
        }
        if(m==1){
            return n-1;
        }
        if(n==1){
            return m-1;
        }
        return (step(m,n-1)+1)+(step(m-1,n)+1);

    }
}
