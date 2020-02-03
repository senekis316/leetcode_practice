package practice.leecode.Bits;

public class ToHex_405 {

    public String toHex(int num) {
        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        do {
            sb.insert(0, hex[num & 15]);
            num >>>= 4;
        } while(num != 0);
        return sb.toString();
    }

}
