package com.douyin.string;

public class ReplaceBlank {
    public void replaceBlank(String s,String replace){
        if(s.length()==0 || s.isEmpty()){
            System.out.println("空串");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==' '){
                stringBuffer.append(replace);
                continue;
            }else{
                stringBuffer.append(s.charAt(i));
            }
        }
        System.out.println(stringBuffer);
    }
}
