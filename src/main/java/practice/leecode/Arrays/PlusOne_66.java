package practice.leecode.Arrays;

public class PlusOne_66 {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = ++digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    /*public int[] plusOne(int[] digits) {

        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += carry;
            carry = 0;
            if (digits[i] == 10) {
                carry = 1;
                digits[i] = 0;
            }
        }

        if (carry == 1) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for (int i = 1; i < digits.length; i++) {
                newDigits[i] = digits[i - 1];
            }
            digits = newDigits;
        }

        return digits;

    }*/

}
