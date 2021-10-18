package practice.leecode.Bits;

public class FindComplement_476 {

    public int findComplement(int num) {
        int num1 = num;
        int num2 = 0;
        while (num1 > 0) {
            num1 >>= 1;
            num2 = (num2 << 1) + 1;
        }
        return num ^ num2;
    }

}
