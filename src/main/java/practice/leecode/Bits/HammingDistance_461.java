package practice.leecode.Bits;

public class HammingDistance_461 {

    public int hammingDistance(int x, int y) {
        int hamming = 0;
        int xor = x ^ y;
        while(xor > 0) {
            if (xor % 2 == 1) {
                hamming++;
            }
            xor = xor >> 1;
        }
        return hamming;
    }

}
