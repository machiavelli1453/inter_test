package online_test;

import java.util.*;

public class reverse_num {
    public static void main(String[] args){
        StringBuffer str_b;
        Integer enter;
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()){
            enter = input.nextInt();
            str_b = new StringBuffer(enter.toString());
            str_b.reverse();
            System.out.println(str_b);
        }
    }
}