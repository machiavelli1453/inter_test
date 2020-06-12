package online_test2;

import java.util.Scanner;
//c意思是已经成熟的兔子，也就是表示3个月及以上的兔子，也就是说c表示能生兔子的兔子。
//那就可以以月份循环，每到达新的一个月，b都会成熟，所以c+=b，c就更新了，仍然表示所有成熟了的兔子，
// b怎么更新呢？b其实就是上个月那些成熟度是1个月的兔子，所以再更新b，用b=a；a呢？a就是现在更新后的c，
// 因为更新后的c表示这个月成熟了的兔子，那这些兔子都会生一只新的兔子，新兔子就是成熟度为1个月的，所以用a=c。这样现在这个月的兔子总数就是a+b+c。
public class rabbit_breed{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int enter  = in.nextInt();
            int first = 1;
            int second = 0;
            int third_above = 0;
            for (int i = 1; i < enter;i++){
                third_above += second;
                second = first;
                first = third_above;
            }
            System.out.println(third_above+second+first);
        }
    }
}

