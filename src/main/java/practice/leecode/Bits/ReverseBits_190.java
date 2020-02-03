package practice.leecode.Bits;

public class ReverseBits_190 {

    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i <= 32; i++) {
            int temp = n >> i;
            temp &= 1;
            temp = temp << (31 - i);
            result |= temp;
        }
        return result;
    }

}
