package online_test;

import java.util.*;

public class recursive_move {

    public static int res_move(int N,int M){
        if (N == 0 || M ==0){
            return 1;
        }
        else{
            return res_move(N-1,M)+res_move(N,M-1);
        }
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int N = in.nextInt();
            int M = in.nextInt();
            System.out.println(res_move(N,M));
        }
    }
}
