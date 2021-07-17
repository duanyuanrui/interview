package com.douyin.string;

public class ValidIP {
    public boolean fun(String ip){
        String regex ="^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\."+
        "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."+
        "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."+
        "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
        if(ip.isEmpty() || ip.length()==0){
            return  false;
        }
        if(ip.matches(regex)){
            return true;
        }else{
            return false;
        }
    }
}
