package com.douyin.linklist;

public class SingleList {
    static Node head = new Node();  //head

    //头插法
    public void addHead(Node node){
        if(node == null){
            return;
        }
        node.next = head.next;
        head.next = node;
    }

    //尾插法
    public void addTail(Node node){
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = node;
    }

    //第k个位置插入节点
    public void addKLocation(Node node,int k){
        int count = 0;


    }
    //遍历链表
    public void printNode(){
        Node temp = head.next;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    //统计链表长度
    public int getLength(){
        int count = 0;
        return count;
    }
    //删除尾节点
    //删除第K个节点
}
