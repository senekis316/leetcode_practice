package practice.leecode.Arrays;

public class FindNumbers_1295 {

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int bits = 0;
            while(num > 0) {
                num /= 10;
                bits++;
            }
            count = (bits & 1) == 0 ? count + 1 : count;
        }
        return count;
    }
    
    /*public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((String.valueOf(num).length() & 1) == 0) {
                count++;
            }
        }
        return count;
    }*/

    /*public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((num & 1) != 1) {
                count++;
            }
        }
        return count;
    }*/

}
