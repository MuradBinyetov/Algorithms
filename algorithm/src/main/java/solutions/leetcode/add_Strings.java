package solutions.leetcode;

public class add_Strings {
    public String addStrings(String num1, String num2) {

        //Bu kod menim aglima gelmedi internetden tapdim :)

        StringBuilder sb = new StringBuilder(); // Used to build the result string efficiently
        int i = num1.length() - 1; // Pointer for num1, starting from the last digit
        int j = num2.length() - 1; // Pointer for num2, starting from the last digit
        int carry = 0; // Initialize carry to 0

        // Loop until both strings are processed and there's no remaining carry
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = 0;
            if (i >= 0) {
                digit1 = num1.charAt(i) - '0'; // Convert char to int
                i--; // Move to the next digit in num1
            }

            int digit2 = 0;
            if (j >= 0) {
                digit2 = num2.charAt(j) - '0'; // Convert char to int
                j--; // Move to the next digit in num2
            }

            int sum = digit1 + digit2 + carry; // Calculate the sum of current digits and carry
            sb.append(sum % 10); // Append the last digit of the sum to the result
            carry = sum / 10; // Update the carry for the next iteration
        }

        return sb.reverse().toString(); // Reverse the result and convert to String

    }
}
