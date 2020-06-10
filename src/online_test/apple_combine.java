package online_test;

import java.util.Scanner;

public class apple_combine {

    public static int apple_com(int M,int N){
        if (M==1 || N ==1){
            return 1;
        }
        else if(M < 0){
            return 0;
        }
        else{
            return (apple_com(M,N-1) + apple_com(M-N,N));
        }

    }

    public static void main(String[] args) {
        int M;
        int N;
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            M = in.nextInt();
            N = in.nextInt();
            if (M > 10 || N > 10 || M < 1 || N <1){
                System.out.println(-1);
            }
            else {
                System.out.println(apple_com(M, N));
            }
        }
    }
}
