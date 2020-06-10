package online_test;

import java.util.*;

//编写一个函数，传入一个int型数组，返回该数组能否分成两组，
// 使得两组中各元素加起来的和相等，并且，所有5的倍数必须在其中一个组中，
// 所有3的倍数在另一个组中（不包括5的倍数），能满足以上条件，返回true；不满足时返回false。

//输入
//        4
//       1 5 -5 1
//        输出
//        true

public class group_3_5 {


    public static boolean IsMatched(int five_g,int three_g,int index,int [] nums) {
        if (index == nums.length && five_g != three_g){ //在递归到底的时候，看看两个组的和是不是一样，然后返回T/F
            return false;
        }
        if (index == nums.length && five_g == three_g){
            return true;
        }
        if (index < nums.length){ //现有两组，剩余nums里的数要么在sum1里要么在sum2里，利用递归依次放在sum1和sum2中, OR 使得只要有一种True最终结果就是True
            return IsMatched(five_g + nums[index],three_g,index+1,nums) || IsMatched(five_g,three_g + nums[index],index+1,nums) ;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            int total = Integer.parseInt(in.nextLine());
            String[] str_list = (in.nextLine()).split(" ");
            int [] nums = new int[total];
            int index = 0,five_g = 0,three_g = 0;
            for (int i = 0; i < total; i++){
                int tmp = Integer.parseInt(str_list[i]);

                if (tmp % 5 == 0){ //分组5和3的倍数
                    five_g += tmp;
                }
                else if (tmp % 3 == 0){
                    three_g += tmp;
                }
                else {  //剩下的丢进一个数组
                    nums[index++] = tmp;
                }
            }

            System.out.println(IsMatched(five_g,three_g,0,nums)); //递归
        }
    }
}