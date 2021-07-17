package com.douyin.linklist;

public class Node {
    int data;
    Node next;
    //无参构造函数
    public Node(){
    }

    //有参构造
    public Node(int data){
        this.data = data;
    }

    @Override
    public String toString(){
        return "data="+data;
    }
}
