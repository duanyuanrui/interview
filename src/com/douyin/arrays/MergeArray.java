package com.douyin.arrays;

public class MergeArray {
    //合并有序数组
    public void mergeList(){
        int a[] = {2,13,24,35,46,57,68,79};
        int b[] = {0,1,45,56};
        int result[] = new int[a.length+b.length];
        int i=0;
        int j = 0;
        int k = 0;
        while (i<a.length && j<b.length){
            if(a[i]<=b[j]){
                result[k++] = a[i++];
            }else{
                result[k++] = a[j++];
            }
        }
        System.out.println(result[k]);
        //数组不一样长短
        while(i<a.length){
            result[k++] = a[i++];
        }
        while (j<b.length){
            result[k++] = b[j++];
        }
        for (k = 0; k<result.length;k++){
            System.out.println(result[k]);
        }
    }
}
