package com.douyin.sort;

public class MaoPao {
    //冒泡
    public void fun(){
        int a[] = {34,2,-9,69,99,45,66,56,34};
        for(int i = 0;i < a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i :a){
            System.out.println(i);
        }

    }
}
