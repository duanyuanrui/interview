package com.douyin.stack;

import java.util.Stack;

public class BracketMatch {
    public void check(String s){
        Stack<Character> stack = new Stack<>();
        char c[] = s.toCharArray();
        for(int i=0;i<c.length;i++){
            //
            if(c[i]!='}'&&c[i]!=']'&&c[i]!=')'){
                stack.push(c[i]);
            }else{
                while(stack.peek()!='{'&&stack.peek()!='['&&stack.peek()!='('){
                    stack.pop();
                }
                if(c[i]=='}'&&stack.peek()=='{'){
                    stack.pop();
                }else if(c[i]==')'&&stack.peek()=='('){
                    stack.pop();
                }else if(c[i]==']'&&stack.peek()=='['){
                    stack.pop();
                }else {
                    stack.push(c[i]);
                }
            }
        }
        while(!stack.empty()){
            if(stack.peek()!='{'&&stack.peek()!='['&&stack.peek()!='('){
                stack.pop();

            }else{
                break;
            }
        }
        if(stack.empty()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    public boolean check2(String s){
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            //入栈规则
            if (c[i] == '(' || c[i] == '{' || c[i] == '[') {
                stack.push(c[i]);
                continue;
            }
            //过滤非{} [] ()
            if (c[i] != '(' && c[i] != ')' && c[i] != '[' && c[i] != ']' && c[i] != '{' && c[i] != '}') {
                continue;
            }
            //出栈
            if (stack.isEmpty() || !isMatch(c[i], stack.peek())) {
                return false;
            }
            if (!stack.isEmpty() && isMatch(c[i], stack.peek())) {
                stack.pop();
                continue;
            }

        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;

    }
    public boolean isMatch(char right,char left){
        if(right == ')'){
            return left=='(';
        }
        if(right == ']'){
            return left=='[';
        }
        if(right == '}'){
            return left=='{';
        }
        return false;
    }
}