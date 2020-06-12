package online_test2;

import java.util.*;

public class Perfect_number {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int enter = in.nextInt();
            int count = 0;
            for (int i = 1;i < enter;i++){
                int sum = 0;
                for (int j = 1; j < i;j++){
                    if ( i % j == 0){
                        sum += j;
                    }
                }
                if ( sum == i){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
