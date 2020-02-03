package practice.leecode.Arrays;

public class RelativeSortArray_1122 {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) return arr2;
        int z = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != arr1[z]) {
                for (int j = z + 1; j < arr1.length; j++) {
                    if (arr2[i] == arr1[j]) {
                        arr1[j] = arr1[z] ^ arr1[j];
                        arr1[z] = arr1[z] ^ arr1[j];
                        arr1[j] = arr1[z] ^ arr1[j];
                        z++;
                    }
                }
            } else {
                z++;
                i--;
            }
        }
        int[] arr = new int[arr1.length - z];
        System.arraycopy(arr1, z, arr, 0, arr.length);
        quick_sort(arr, 0, arr.length - 1);
        System.arraycopy(arr, 0, arr1, z, arr.length);
        return arr1;
    }

    private void quick_sort(int[] nums, int l, int r) {
        if (l < r) {
            int i = l, j = r, m = nums[l];
            while(i < j) {
                while(i < j && nums[j] >= m) {
                    j--;
                }
                if (i < j) {
                    nums[i++] = nums[j];
                }
                while(i < j && nums[i] < m) {
                    i++;
                }
                if (i < j) {
                    nums[j--] = nums[i];
                }
            }
            nums[i] = m;
            quick_sort(nums, l, i - 1);
            quick_sort(nums, i + 1, r);
        }
    }

}
