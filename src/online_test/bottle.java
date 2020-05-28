package online_test;

import java.util.Scanner;

public class bottle {
    public static int return_bot(int empty_bottle)
    {
        int ex_bottle = 0;
        int total_drank = 0;
        int exit_stat = 0;

        while (exit_stat != 1) {
            ex_bottle = empty_bottle / 3;
            empty_bottle = ex_bottle + empty_bottle % 3;
            total_drank += ex_bottle;
            if (empty_bottle == 2){
                total_drank++;
                exit_stat = 1;
            }
            else if (empty_bottle < 2){
                exit_stat = 1;
            }
        }

        return total_drank;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            System.out.println(return_bot(n));
        }
    }
}
