package practice.leecode.Arrays;

public class TwoSum_167 {


    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0, j = numbers.length - 1; i != j;) {
            if (i >= target) {
                break;
            }
            if (2 * i > target) {
                break;
            }
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return null;
    }

    /*public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] + numbers[i] > target) {
                break;
            }
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (sum == target) {
                    return new int[]{i + 1, j + 1};
                }
                if (sum > target) {
                    break;
                }
            }
        }
        return null;
    }*/

}
