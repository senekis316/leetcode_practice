package practice.leecode.Bits;

public class ReverseBits_190 {

    private static final int M1 = 0x55555555;
    private static final int M2 = 0x33333333;
    private static final int M4 = 0x0f0f0f0f;
    private static final int M8 = 0x00ff00ff;

    public int reverseBits(int n) {
        n = n >>> 16 | n << 16;
        n = n >>> 8 & M8 | (n & M8) << 8;
        n = n >>> 4 & M4 | (n & M4) << 4;
        n = n >>> 2 & M2 | (n & M2) << 2;
        return n >>> 1 & M1 | (n & M1) << 1;
    }

//    public int reverseBits(int n) {
//        int ans = 0;
//        int cnt = 32;
//        while (cnt-- != 0) {
//            ans = (ans << 1) | (n & 1);
//            n >>= 1;
//        }
//        return ans;
//    }

//    public int reverseBits(int n) {
//        int result = 0;
//        for (int i = 0; i <= 32; i++) {
//            int temp = n >> i;
//            temp &= 1;
//            temp = temp << (31 - i);
//            result |= temp;
//        }
//        return result;
//    }

}
