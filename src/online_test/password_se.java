package online_test;

import java.util.*;

public class password_se {

    public static int get_score(StringBuffer str_b){
        int score = 0;
        if ( str_b.length() <= 4){
            score += 5;
        }
        else if (str_b.length() > 4 && str_b.length() <= 7){
            score += 10;
        }
        else if(str_b.length() >= 8){
            score += 25;
        }

        int hasCap = 0;
        int hasChar = 0;
        int has_num = 0;
        int has_mark = 0;

        for (int i = 0;i < str_b.length();i++){
            int test = (int) str_b.charAt(i);
            if (test >= 65 && test <= 90 ){
                hasCap = 1;
            }
            if (test >= 97 && test <= 122 ){
                hasChar = 1;
            }
            if (test >= 48 && test <= 57 ){
                has_num += 1;
            }
            if ((test >= 33 && test <= 47) || (test >= 58 && test <= 64) || (test >= 91 && test <= 96) || (test >= 123 && test <= 126) ){
                has_mark += 1;
            }
        }

        if (hasCap == 1){
            score += 10;
        }
        if (hasChar == 1){
            score += 10;
        }

        if (has_num == 1){
            score += 10;
        }
        else if (has_num > 1){
            score += 20;
        }

        if (has_mark == 1){
            score += 10;
        }
        else if (has_mark > 1){
            score += 25;
        }

        if (hasCap == 1 && hasChar == 1 && has_num > 0 && has_mark > 0){
            score +=5;
        }
        if ((hasCap == 1 || hasChar == 1) && has_num > 0 && has_mark > 0){
            score += 3;
        }
        if ((hasCap == 1 || hasChar == 1) && has_num > 0){
            score += 2;
        }

        return score;
    }



    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine().trim();
            StringBuffer str_b = new StringBuffer(str);
            int score = get_score(str_b);
            if (score >= 90){
                System.out.println("VERY_SECURE");
            }
            else if (score >= 80){
                System.out.println("SECURE");
            }
            else if (score >= 70){
                System.out.println("VERY_STRONG");
            }
            else if (score >= 60){
                System.out.println("STRONG");
            }
            else if (score >= 50){
                System.out.println("AVERAGE");
            }
            else if (score >= 25){
                System.out.println("WEAK");
            }
            else{
                System.out.println("VERY_WEAK");
            }
        }
    }

}
