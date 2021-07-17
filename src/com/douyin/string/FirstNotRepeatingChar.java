package com.douyin.string;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class FirstNotRepeatingChar {
    public char fun(String s){
        char[] c = s.toCharArray();
        LinkedHashMap<Character,Integer> linkedHashMap = new LinkedHashMap<>();
        for(int i =0;i<c.length;i++){
            if(linkedHashMap.containsKey(c[i])){
                linkedHashMap.put(c[i],linkedHashMap.get(c[i])+1);
            }else{
                linkedHashMap.put(c[i],1);
            }
        }
        for(Character character:linkedHashMap.keySet()){
            if(linkedHashMap.get(character).intValue()==1){
                return character;
            }
        }
        return ' ';
    }
    public char firstNotRepeatingChar2(String str){
        int[] times = new int[256];
        //char类型转换为int类型，对应到times中
        for(int i = 0;i<str.length();i++){
            times[str.charAt(i)]++;
        }
        for(int j = 0; j<str.length();j++){
            if(times[str.charAt(j)]==1){
               return str.charAt(j);
            }
        }
        return ' ';
    }
}
