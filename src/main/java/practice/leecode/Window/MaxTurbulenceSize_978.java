package practice.leecode.Window;

public class MaxTurbulenceSize_978 {

    public int maxTurbulenceSize(int[] arr) {
        int cnt = 1;
        int max = 1;
        boolean prev;
        boolean curr;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                cnt++;
            }
            max = Math.max(cnt, max);
            if (i < arr.length - 1) {
                prev = arr[i - 1] > arr[i];
                curr = arr[i] > arr[i + 1];
                if (arr[i] == arr[i + 1] || prev == curr) {
                    cnt = 1;
                }
            }
        }
        return max;
    }

}
