package practice.leecode.qq;

public class PalidromeNumber_9 {

    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10  + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber/10;
    }

    /*public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }

        List<Integer> nums = new ArrayList();
        int y = x;
        while (true) {
            int div = y / 10;
            int mod = y % 10;
            if (div == 0 && mod == 0) {
                break;
            }
            nums.add(mod);
            y = div;
        }

        for (int i=0; i < nums.size() / 2; i++) {
            if (nums.get(i) != nums.get(nums.size() - i - 1)) {
                return false;
            }
        }

        return true;
    }*/
}
