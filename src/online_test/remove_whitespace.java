package online_test;

import java.util.*;

public class remove_whitespace {
    public static void main(String[] args){
        String enter;
        Scanner input = new Scanner(System.in);
        String out = "";
        int count;
        ArrayList<String> str_arr = new ArrayList();

        while (input.hasNextLine()){
            out = "";
            count = 0;
            enter = input.nextLine();
            enter += " ";
            str_arr.clear();
            for (int i = 0; i < enter.length();i++){
                if(enter.charAt(i) == ' '){
                    for (int j = count;j < (i);j++ ){
                        if (enter.charAt(j) != ' ') {
                            out += enter.charAt(j);

                        }

                    }
                    str_arr.add(out);
                    count = i;
                    out = "";
                }
            }
            System.out.println(str_arr.size());
            for (String string_1 : str_arr){
                System.out.println(string_1);
            }
        }

    }
}
