package online_test1_real;

import java.util.Scanner;

public class Arithmetic_progression {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int res = 0;
            for (int i = 0; i < n;i++) {
                res += 2 + 3 *i;
            }
            System.out.println(res);
        }
        // an = 2 + 3*n,把an加起来就行了
    }
}
