package practice.leecode;

public class IsPerfectSquare_367 {

    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        int i = num / 2;
        while((double)i * i > num) {
            i = (i + num / i) / 2;
        }
        return i * i == num;
    }

}
