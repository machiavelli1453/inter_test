package online_test2;

import java.util.Scanner;

public class Get_common_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String input = sc.nextLine();
            String input_2 = sc.nextLine();
            System.out.println(getResult(input,input_2));
        }
    }

    public static int getResult(String input,String input_2){
        int result = 0;
        for (int i = input_2.length(); i >= 1;i--){
            for (int j = 0; j <= input_2.length() - i ;j++){
                String tmp = input_2.substring(j , j + i);
                if (input.contains(tmp)){
                    return i;
                }
            }
        }

        return result;
    }

}
