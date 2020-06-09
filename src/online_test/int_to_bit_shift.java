package online_test;

import java.util.*;

public class int_to_bit_shift {

    public static void main(String[] args) {
        int enter;
        int count;
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()){

            count = 0;
            enter = in.nextInt();
            while(enter>0){
                if((enter & 1) > 0){

                    count++;
                }
                enter=enter>>1;
            }
            System.out.println(count);

        }
    }
}
