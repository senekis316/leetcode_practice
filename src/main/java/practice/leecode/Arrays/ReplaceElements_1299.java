package practice.leecode.Arrays;

public class ReplaceElements_1299 {

    public int[] replaceElements(int[] arr) {
        int curr = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 1; i > 0; i--) {
            int tmp = arr[i - 1];
            arr[i - 1] = Math.max(curr, arr[i]);
            curr = tmp;
        }
        return arr;
    }


    /*public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = -1;
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            ans[i] = Math.max(arr[i + 1], ans[i + 1]);
        }
        return ans;
    }*/

}
