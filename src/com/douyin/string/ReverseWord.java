package com.douyin.string;

import java.util.Stack;

public class ReverseWord {
    public void reverseWord(String s){
        StringBuffer stringBuffer = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        if(s==null || s.isEmpty()){
            System.out.println("空字符串");
        }
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        for(int i =0;i<s.length();i++){
            stringBuffer.append(stack.pop());
        }
        System.out.println(stringBuffer.toString());
    }
}
