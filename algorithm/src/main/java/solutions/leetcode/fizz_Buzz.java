package solutions.leetcode;

import java.util.ArrayList;
import java.util.List;

public class fizz_Buzz {
    public static List<String> fizzBuzz(int n) {
        var list = new ArrayList<String>();
        for(int j=1;j<=n;j++){
            if(j%3==0&&j%5==0){
                list.add("FizzBuzz");
            }
            else if(j%3==0){
                list.add("Fizz");
            }
            else if(j%5==0){
                list.add("Buzz");
            }
            else{
                list.add(String.valueOf(j));
            }
        }
        return list;
    }
}
