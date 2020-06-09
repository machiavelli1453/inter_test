package online_test;

import java.util.Scanner;

public class round_num {
    public static void main(String[] args) {
        float enter;
        int sda;
        float test;
        Scanner in = new Scanner(System.in);
        while (in.hasNextFloat()){
            enter = in.nextFloat();
            sda = (int) enter;
            test = enter - (float) sda;
            if ( test >= 0.5){
                sda++;
            }
            System.out.println(sda);
        }
    }
}
