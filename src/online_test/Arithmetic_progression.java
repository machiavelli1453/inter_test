package online_test;

import java.util.*;

//功能:等差数列 2，5，8，11，14。。。。
//
//输入:正整数N >0
//
//输出:求等差数列前N项和
//
//返回:转换成功返回 0 ,非法输入与异常返回-1

public class Arithmetic_progression {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                int n = in.nextInt();
                if(n<1){
                    System.out.println(-1);
                }else{
                    System.out.println((2*n+3*n*(n-1)/2)); //Sn = a1*n+[n*(n-1)*d]/2 , 根据观察题目我们可知 a1 = 2, d = 3。

                }

            }
            in.close();
        }
    }
