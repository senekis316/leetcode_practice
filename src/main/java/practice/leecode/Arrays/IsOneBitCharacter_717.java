package practice.leecode.Arrays;

public class IsOneBitCharacter_717 {

    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while(i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }

    /*public boolean isOneBitCharacter(int[] bits) {
        int count = 0;
        for (int i = 0; i < bits.length - 1; i++) {
            if (count != 0 && (bits[i]  == 0 || bits[i] == 1)) {
                count--;
            } else if (count == 0 && bits[i] == 1) {
                count++;
            }
        }
        return count == 0 && bits[bits.length - 1] == 0 ? true : false;
    }*/

}
