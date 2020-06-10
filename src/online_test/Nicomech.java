package online_test;

import java.util.*;

//验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
//
//例如：
//
//1^3=1
//
//2^3=3+5
//
//3^3=7+9+11
//
//4^3=13+15+17+19


public class Nicomech {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()){
            int n = in.nextInt();
            Integer first = n*n - n + 1;
            String str = "";
            for (int i = 0;i < n;i++){
                if(i == n - 1) {
                    str += first.toString();
                }
                else{
                    str += first.toString() + "+";
                }
                first += 2;
            }
            System.out.println(str);
        }

    }
}
