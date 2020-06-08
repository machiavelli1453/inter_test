package online_test;

import java.util.ArrayList;
import java.util.Scanner;

public class no_repeat {
    public static void main(String[] args) {
        String str;
        ArrayList<Character> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            str = sc.next();
            for (int i = 0; i < str.length(); i++) {
                array.add(str.charAt(i));
            }

            for (int i = 0; i < array.size(); i++) {
                for (int j = i; j < array.size(); j++){
                    if (array.get(i).equals(array.get(j)) && j != i){
                        array.remove(j);
                        j--;
                    }
                }
            }
            str = "";
            for (int i = 0; i < array.size(); i++) {
                str += array.get(i);

            }
            System.out.println(str);
            array.clear();
        }

    }
}
