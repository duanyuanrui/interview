package com.douyin.string;

import java.util.Stack;

public class TurnString {
    //字符串中单词翻转
    //用数组实现
    public void fun1(){
        String s= "i am a student";
        String s1[] = s.split(" ");
        String s3[] = new String[s1.length];
        for (int i = 0 ;i<s1.length;i++){
            s3[i] = s1[s1.length-1-i];
        }
        for(int i = 0 ;i<s3.length;i++){
            System.out.print(s3[i]+" ");
        }
    }
    //用栈实现
    public void fun2(){
        String s ="www.douyin.com";
        Stack<String> stack = new Stack<>();
        String[]  array= s.split("\\.");  //需要转义
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0;i<array.length;i++){
            stack.push(array[i]);
        }
        for(int i = 0;i<array.length;i++){
            if(i<=array.length-2){
                stringBuffer.append(stack.pop()).append(".");
            }else{
                stringBuffer.append(stack.pop());
            }
        }
        System.out.println(stringBuffer.toString());
    }

}
