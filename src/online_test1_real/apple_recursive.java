package online_test1_real;

import java.util.Scanner;

public class apple_recursive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int M = in.nextInt();
            int N = in.nextInt();
            if (M > 10 || N > 10 || M < 1 || N <1){
                System.out.println(-1);
            }
            else {
                System.out.println(apple_com(M, N));
            }
        }
    }

    public static int apple_com(int M,int N){
        if (M < 0){
            return 0;
        }
        if (M == 1 || N==1){
            return 1;
        }
        return apple_com(M-N,N) +apple_com(M,N-1) ;

        //1.假设有一个盘子为空，则(m,n)问题转化为将m个苹果放在n-1个盘子上，即求得(m,n-1)即可
        //2.假设所有盘子都装有苹果，则每个盘子上至少有一个苹果，即最多剩下m-n个苹果，问题转化为将m-n个苹果放到n个盘子上
    }
}
