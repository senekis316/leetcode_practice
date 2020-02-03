package practice.leecode.Bits;

public class HammingWeight_191 {

    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i <= 31; i++) {
            int temp = n >> i;
            temp &= 1;
            if (temp == 1) {
                count++;
            }
        }
        return count;
    }

}
