package com.douyin.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GetNumString {
    //统计字母个数
    public void getNumString(){
        String s = "w e r t y u i o w w w d e r t y u";
        String arr[]=s.split(" ");
        Map<String , Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]).intValue()+1);
            }else {
                map.put(arr[i],1);
            }
        }
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next().toString();
            System.out.println("key="+key+"   "+"value="+map.get(key).toString());
        }
    }
}
