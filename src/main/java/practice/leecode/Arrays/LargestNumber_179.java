package practice.leecode.Arrays;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class LargestNumber_179 {

    public String largestNumber(int[] nums) {
        quick_sort(0, nums.length - 1, nums);
        if (nums[0] == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
        }
        return sb.toString();
    }

    private void quick_sort(int l, int r, int[] nums) {
        if (l < r) {
            int i = l, j = r;
            int m = nums[l];
            while (i < j) {
                while (i < j && compare(nums[j], m) <= 0) {
                    j--;
                }
                if (i < j) {
                    nums[i++] = nums[j];
                }
                while(i < j && compare(nums[i], m) > 0) {
                    i++;
                }
                if (i < j) {
                    nums[j--] = nums[i];
                }
                nums[i] = m;
                quick_sort(l, i - 1, nums);
                quick_sort(i + 1, r, nums);
            }
        }
    }

    private int compare(int num1, int num2) {
        int len1 = (num1 + "").length();
        int len2 = (num2 + "").length();
        if (len1 != len2) {
            int tmp1 = (int)(num1 * Math.pow(10, len2)) + num2;
            int tmp2 = (int)(num2 * Math.pow(10, len1)) + num1;
            num1 = tmp1;
            num2 = tmp2;
        }
        if (num1 > num2) {
            return 1;
        } else if (num1 < num2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        BigDecimal amount = new BigDecimal("1.1");
        DecimalFormat df = new DecimalFormat("###,###,###,###.00");
        System.out.println(df.format(amount.doubleValue()));
    }


    /*public String largestNumber(int[] nums) {
        String[] numbers = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numbers[i] = String.valueOf(nums[i]);
        }
        quick_sort(0, nums.length - 1, numbers);
        if (numbers[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
        }
        return sb.toString();
    }

    private void quick_sort(int l, int r, String[] nums) {
        if (l < r) {
            int i = l, j = r;
            String m = nums[l];
            while (i < j) {
                while (i < j && compare(nums[j], m) <= 0) {
                    j--;
                }
                if (i < j) {
                    nums[i++] = nums[j];
                }
                while(i < j && compare(nums[i], m) > 0) {
                    i++;
                }
                if (i < j) {
                    nums[j--] = nums[i];
                }
                nums[i] = m;
                quick_sort(l, i - 1, nums);
                quick_sort(i + 1, r, nums);
            }
        }
    }

    private int compare(String s1, String s2) {
        String sum1 = s1 + s2;
        String sum2 = s2 + s1;
        return sum1.compareTo(sum2);
    }*/


}
