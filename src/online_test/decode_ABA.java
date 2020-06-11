package online_test;

import java.util.*;

public class decode_ABA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input = sc.next();
            System.out.println(getNumber(input));
        }
    }
    public static int getNumber(String str){
        int result = 1;
        //将字符串反转
        StringBuffer sb = new StringBuffer(str);
        String temp = sb.reverse().toString();
        //获取所有子串，查看翻转后的字符串是否包含该子串
        for(int i = temp.length(); i >= 1 ;i--){
            for(int j = 0; j <= temp.length()-i;j++){
                String tempSubString = temp.substring(j,j + i);
                if(str.contains(tempSubString)){

                    return i;
                }
            }
        }
        return result;
    }
}
