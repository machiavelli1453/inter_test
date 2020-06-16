package online_test1_real;

import java.util.Scanner;

public class find_lcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int A = in.nextInt();
            int B = in.nextInt();
            if (A < B){
                int tmp = A;
                A = B;
                B = tmp;
            }
            int A_times_B = A*B;
            int tmp;
            while ( A % B != 0 ){
                tmp = A%B;
                A = B;
                B = tmp;
            }
            System.out.println(A_times_B/B);
            //没用递归。。主要是这题太简单了，用 辗转相除法 就简单解决了。
        }
    }
}
