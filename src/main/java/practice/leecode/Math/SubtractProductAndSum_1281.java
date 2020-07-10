package practice.leecode.Math;

public class SubtractProductAndSum_1281 {

    public int subtractProductAndSum(int n) {
        int mul = 1;
        int sum = 0;
        while(n != 0) {
            int num = n % 10;
            mul *= num;
            sum += num;
            n /= 10;
        }
        return mul - sum;
    }

}
