package practice.leecode.Arrays;

public class FindRadius_475 {

    public int findRadius(int[] houses, int[] heaters) {
        int[] types = new int[houses.length + heaters.length];
        for (int h : houses) {
            types[h] = 1;
        }
        for (int h : heaters) {
            types[h] = 2;
        }
        int res = 0;
        int[] range = new int[2];
        return 0;
    }

}
