package practice.leecode.Arrays;

public class FindSpecialInteger_1287 {

    public int findSpecialInteger(int[] arr) {
        int count = arr.length / 4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + count]) {
                return arr[i];
            }
        }
        return -1;
    }

}
