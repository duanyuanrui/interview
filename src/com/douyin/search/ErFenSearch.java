package com.douyin.search;

public class ErFenSearch {
    //二分查找
    public int erFenSearch(){
        int a[] = {0,1,2,3,4,6,7,8,9};
        int target = 7;//目标数字
        int start = 0;
        int end = a.length-1;
        while (start <= end){
            int mid =( start + end ) / 2 ;
            if(a[mid] == target){
                return  mid;
            }else if(a[mid]>target){
                end = mid -1;
            }else {
                start = mid +1;
            }
        }
        return  -1;
    }
}
