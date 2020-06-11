package online_test;

import java.util.*;

public class byte_1s {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int org_1 = in.nextInt();
            String str = Integer.toBinaryString(org_1);
            int length_1 = 0;
            int count = 0;
            for (int i = 0; i < str.length();i++){
                if (str.charAt(i) == '1'){
                    length_1++;
                }
                else if (str.charAt(i) == '0'){
                    if(length_1 > count) {
                        count = length_1;
                    }
                    length_1 = 0;
                }
            }
            if(length_1 > count) {
                count = length_1;
            }
            System.out.println(count);
        }
    }
}
