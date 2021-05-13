package practice.leecode.Arrays;

public class Decode_1734 {

    // 异或推导: https://leetcode-cn.com/problems/decode-xored-permutation/solution/ji-shuang-yi-wen-dai-ni-shua-liang-dao-j-mujs/
    public int[] decode(int[] encoded) {
        int first = 0;
        for (int i = 1; i <= encoded.length + 1; i++) {
            first ^= i;
        }
        for (int i = 1; i < encoded.length; i += 2) {
            first ^= encoded[i];
        }
        int[] origin = new int[encoded.length + 1];
        origin[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            origin[i + 1] = origin[i] ^ encoded[i];
        }
        return origin;
    }

}
