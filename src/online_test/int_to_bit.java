package online_test;

import java.util.*;

public class int_to_bit {

        public static void main(String[] args) {
            int enter;
            Scanner in = new Scanner(System.in);
            while (in.hasNextInt()){
                enter = Math.abs(in.nextInt());
                System.out.println(Integer.bitCount(enter));
            }
        }
}
