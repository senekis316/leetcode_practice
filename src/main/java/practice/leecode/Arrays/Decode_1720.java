package practice.leecode.Arrays;

public class Decode_1720 {

    public int[] decode(int[] encoded, int first) {
        int[] origin = new int[encoded.length + 1];
        origin[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            origin[i + 1] = origin[i] ^ encoded[i];
        }
        return origin;
    }

}
