package online_test1_real;

import java.util.Scanner;

public class recursive_chest {
    //使用递归，思路就是将问题分为向M走和向N走，这样最后将两者的可能性结合起来。
    // 因为只考虑走M或者N，那就每次减去1，比如第二次考虑N-1的情况，第三次考虑N-2的情况。
    public static int chest_move(int M,int N){
        if (M == 0 || N == 0 ){
            return 1;
        }

        else {
            return chest_move(M-1,N) + chest_move(M,N-1);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int M = in.nextInt();
            int N = in.nextInt();

            System.out.println(chest_move(M,N));
        }
    }
}
