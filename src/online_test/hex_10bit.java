package online_test;

import java.util.*;

public class hex_10bit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String str=in.next().substring(2);
            System.out.println(Integer.parseInt(str,16));
        }
    }
}
