package solutions.leetcode;

import java.math.BigInteger;
import java.util.Objects;

public class add_Binary {
    public static String addBinary(String a, String b) { //a = "11", b = "1"
        if(Objects.equals(a, "0") && Objects.equals(b, "0")) return "0";
        BigInteger index = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;
        var resp = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            if(a.charAt(i) == '1'){
                sum = sum.add(index);
            }
            index = index.multiply(BigInteger.valueOf(2));
        }

        index = BigInteger.ONE;
        for (int i = b.length() - 1; i >= 0; i--) {
            if(b.charAt(i) == '1'){
                sum = sum.add(index);
            }
            index = index.multiply(BigInteger.valueOf(2));
        }

        while (sum.compareTo(BigInteger.ONE) >= 0) {
            resp.append(sum.mod(BigInteger.valueOf(2)));
            sum = sum.divide(BigInteger.valueOf(2));
        }


        return resp.reverse().toString();
    }
}
