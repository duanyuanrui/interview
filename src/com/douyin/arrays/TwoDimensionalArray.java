package com.douyin.arrays;

public class TwoDimensionalArray {
    public void fun(){
        String [][] array = {{"wangge","duanyuanrui"},{"34","32"}};
        for(int i = 0;i<array.length;i++){
            for(int j = 0 ;j<array[i].length;j++){
                System.out.print(array[i][i]);
            }
            System.out.println();
        }
    }
}
