package online_test;

import java.util.Scanner;
//其实这题正常来说是可以直接用math库来实现的，但是为了考察递归，我们故意不用。

public class Least_common_multiple {

    public static int common_multiple(int A,int B){
        return (A*B)/gcd_tmp(A,B);
    }

    public static int gcd_tmp(int A,int B) {
        if (B == 0) {
            return A;
        } else {
            return gcd_tmp(B,A % B);
        }
    }

    public static void main(String[] args) {
        int A;
        int B;
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            A = in.nextInt();
            B = in.nextInt();

            if (B > A){
                int tmp = B;
                B = A;
                A = tmp;
            }

            System.out.println(common_multiple(A, B));

        }
    }
}
