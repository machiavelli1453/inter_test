package online_test1_real;

import java.util.ArrayList;
import java.util.Scanner;
//很简单的题目。。。
public class longest_1s {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            Integer int_1 = in.nextInt();
            StringBuffer strb = new StringBuffer(Integer.toBinaryString(int_1));

            ArrayList<Integer> count = new ArrayList();
            int temp = 0;
            for (int i = 0; i<strb.length();i++){
                if (strb.charAt(i) == '1'){
                    temp++;
                }
                else {
                    count.add(temp);
                    temp = 0;
                }
            }
            count.add(temp);
            int result = 0;
            for(int i = 0; i < count.size();i++){
                if (count.get(i) > result){
                    result = count.get(i) ;
                }
            }
            System.out.println(result);
        }
    }
}
