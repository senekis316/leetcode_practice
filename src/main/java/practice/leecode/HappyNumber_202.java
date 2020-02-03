package practice.leecode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202 {


    public boolean isHappy(int n) {

        Set<Integer> numbers = new HashSet<>();

        while(true) {
            int total = 0;
            while(n != 0) {
                total += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (total == 1) {
                return true;
            }
            if (numbers.contains(total)) {
                return false;
            }
            numbers.add(total);
            n = total;
        }

    }


}
