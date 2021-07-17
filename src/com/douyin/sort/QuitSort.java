package com.douyin.sort;

import java.util.Arrays;

public class QuitSort {
    //快速排序
    public  void fun(){
        int a[] = {65,58,95,10,57,62,13,106,78,23,85};
        System.out.println("排序前"+ Arrays.toString(a));
        quitSort(a,0,a.length-1);
        System.out.println("排序后"+ Arrays.toString(a));

    }

    public  int getIndex(int a[],int left, int right){
        int key = a[left];
        while (left<right){
            while (left<right && a[right]>key){
                right--;
            }
            a[right] = a[left];

            while (left<right && a[left]>key){
                left++;
            }
            a[left]=a[right];
        }
        a[left] = key;
        return left;
    }
    public  void quitSort(int a[],int left,int right){
        int index = 0;
        if(left<right){
            index = getIndex(a,left,right);
            quitSort(a,left,index-1);
            quitSort(a,index+1,right);
        }

    }
}
