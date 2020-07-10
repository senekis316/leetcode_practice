package practice.leecode.Math;

public class AddBinary_67 {

    public String addBinary(String a, String b) {
        int n = a.length();
        int m = b.length();
        if (n < m) {
            return addBinary(b, a);
        }
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int carry = 0 , j = m - 1;
        for (int i = n - 1; j > -1;) {
            int num1 = a.charAt(i--) == '1' ? 1 : 0;
            int num2 = b.charAt(j--) == '1' ? 1 : 0;
            sum = num1 + num2 + carry;
            carry = sum > 1 ? 1 : 0;
            sum = (sum == 1 || sum == 3) ? 1 : 0;
            sb.append(sum);
        }
        for (int i = n - m - 1; i > -1; i--) {
            int num1 = a.charAt(i) == '1' ? 1 : 0;
            if (carry == 1) {
                sum = num1 + carry;
                carry = sum > 1 ? 1 : 0;
                sum = sum == 1 ? 1 : 0;
            } else {
                sum = num1;
            }
            sb.append(sum);
        }
        if (carry == 1) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

}
