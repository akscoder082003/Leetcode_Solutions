/*
 * PROBLEM: 67
 * 
 * Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"
*/
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int endIndexA = a.length() - 1;
        int endIndexB = b.length() - 1;
        int carry = 0;

        while (endIndexA >= 0 || endIndexB >= 0 || carry > 0) {
            int value = carry;
            if (endIndexA >= 0) {
                value += Character.getNumericValue(a.charAt(endIndexA--));
            }
            if (endIndexB >= 0) {
                value += Character.getNumericValue(b.charAt(endIndexB--));
            }
            sb.append(value % 2);
            carry = value / 2;
        }
        return sb.reverse().toString();
    }
}