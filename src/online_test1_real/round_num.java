package online_test1_real;

import java.util.Scanner;

public class round_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextFloat()) {
            Float enter = in.nextFloat();
            Integer int_1 =  enter.intValue();
            if (enter - int_1 >= 0.5f){
                int_1++;
            }
            System.out.println(int_1);


            //或者直接调用Math库来实现，但是很多算法题都不让用Math库。。
            int_1 = Math.round(enter);
            System.out.println(int_1);
        }


    }
}
