package online_test;



import java.util.*;
import java.io.*;

public class Nicomachus_num {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            scanner.nextLine();
            getString(input);
        }
        scanner.close();
    }

    public static void getString(int input) {
        // first Num format
        int curNum = input * (input - 1) + 1;
        StringBuffer sBuffer = new StringBuffer();
        // build string
        for (int i = 0; i < input; i++) {
            if (i == input - 1) {
                sBuffer.append(curNum);
            }
            else {
                sBuffer.append(curNum + "+");
            }
            curNum += 2;
        }
        System.out.println(sBuffer);
    }
}