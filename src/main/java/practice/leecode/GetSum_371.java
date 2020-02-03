package practice.leecode;

public class GetSum_371 {

    public int getSum(int a, int b) {
        while(b != 0) {
            int xor = a ^ b;
            int add = (a & b) << 1;
            a = xor;
            b = add;
        }
        return a;
    }

}
