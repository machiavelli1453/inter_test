package online_test1_real;

import java.util.Scanner;

public class reveres_str {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            StringBuffer str = new StringBuffer(in.nextLine());
            System.out.println(str.reverse());
        }
    }
    //用SstringBuffer自带的方法。。
}
