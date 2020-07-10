package practice.leecode.Sort;

import java.util.ArrayList;
import java.util.List;

public class PancakeSort_969 {

    public List<Integer> pancakeSort(int[] A) {
        List<Integer> nums = new ArrayList<>();
        int search = A.length;
        while(search != 1) {
            for (int i = 0; i < A.length; i++) {
                if (search == 2 && A[0] == 2) {
                    nums.add(--search);
                    break;
                }
                if (A[i] == search && i != search - 1) {
                    nums.add(i);
                    for (int j = 0, z = i; j < z; z--, j++) {
                        A[z] = A[j] ^ A[z];
                        A[j] = A[j] ^ A[z];
                        A[z] = A[j] ^ A[z];
                    }
                    for (int j = 0, z = search - 1; j < z; z--, j++) {
                        A[z] = A[j] ^ A[z];
                        A[j] = A[j] ^ A[z];
                        A[z] = A[j] ^ A[z];
                    }
                    nums.add(--search);
                    break;
                }
            }
        }
        return nums;
    }

//    3, 2, 4, 1
//    4, 2, 3, 1
//    1, 3, 2, 4
//    3, 1, 2, 4
//    2, 1, 3, 4
//    1, 2, 3, 4

}
