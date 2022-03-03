package practice.leecode.Bits;

public class AddDigits_258 {

//    public int addDigits(int num) {
//        if (num < 10) return num;
//        int sum = 0;
//        while (num != 0) {
//            sum += num % 10;
//            num /= 10;
//        }
//        return addDigits(sum);
//    }

    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }

}
