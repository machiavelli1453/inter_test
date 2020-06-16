package online_test1_real;

import java.util.Scanner;

public class find_1s {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            Integer enter = in.nextInt();
            //System.out.println(Integer.bitCount(enter));   //方法一：用预设的方法，这是最简单的办法，但是不能考察右移左移的能力


            int test_en = enter;
            int count = 0 ;
            for (int i=0; i < enter;i++){
                if(test_en % 2 == 1){
                    count++;
                }
                test_en = test_en >> 1 ;
            }
            System.out.println(count); //方法二：用右移来实现，这是标准做法。
        }
    }
}
