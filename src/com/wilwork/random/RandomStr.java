package com.wilwork.random;

import java.util.Random;

public class RandomStr {
    //length产生字符串的长度
    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer strr=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(62);
            strr.append(str.charAt(number));
        }
        return strr.toString();
    }
}
