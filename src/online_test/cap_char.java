package online_test;

import java.util.Scanner;

public class cap_char {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine().trim();
            int hasCap = 0;
            for (int i= 0; i< str.length();i++){
                int test = (int) str.charAt(i);
                if (test >= 65 && test <= 90 ){
                    hasCap += 1;
                }
            }
            System.out.println(hasCap);
        }
    }
}
