package com.douyin;

import java.io.*;
import java.util.HashMap;
import java.util.IdentityHashMap;

public class FileStream {
    public void readFromFile(String path){
        try{
            File file = new File(path);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String str = null;
            //存取code和responseTime
            IdentityHashMap <String,Integer> identityHashMap = new IdentityHashMap<>();
            while ((str=in.readLine())!=null){
                String [] stringArray = str.split(" ");
                identityHashMap.put(stringArray[1],Integer.valueOf(stringArray[2]));
            }
            int count = 1;
            int times = 0;
            for(String key : identityHashMap.keySet()){
                if("200".equals(key)){
                    count++;
                    times+=identityHashMap.get(key).intValue();
                }else{
                    continue;
                }
            }
            double avgTime = times/count;
            System.out.println("响应成功的请求平均时间为"+avgTime);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
