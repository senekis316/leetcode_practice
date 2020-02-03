package practice.leecode.Arrays;

public class CanPlaceFlowers_605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0
                    && (i == 0 || flowerbed[i - 1] == 0)
                    && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) && n > 0) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n == 0 ? true : false;
    }

}
