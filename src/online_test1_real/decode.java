package online_test1_real;

import java.util.Scanner;
public class decode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input = sc.next();
            System.out.println(getNumber(input));
        }
    }
    public static int getNumber(String input){
        StringBuffer input_b = new StringBuffer(input);
        StringBuffer reverse_input = input_b.reverse();
        int count = 1;
        for (int i = reverse_input.length();i > 0;i--){
            for (int j = 0; j <= reverse_input.length() - i;j++){
                String temp = reverse_input.substring(j,j+i);
                if (input.contains(temp)){
                    return i;
                }
            }
        }
        return count;
    }
}
