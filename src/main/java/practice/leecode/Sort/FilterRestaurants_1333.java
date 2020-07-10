package practice.leecode.Sort;

import java.util.ArrayList;
import java.util.List;

public class FilterRestaurants_1333 {

    // 餐馆 1 [id=1, rating=4, veganFriendly=1, price=40, distance=10]
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        quick_sort(0, restaurants.length - 1, restaurants);
        List<Integer> ids = new ArrayList<>();
        for (int[] restaurant : restaurants) {
            if (restaurant[2] >= veganFriendly && restaurant[3] <= maxPrice && restaurant[4] <= maxDistance) {
                ids.add(restaurant[0]);
            }
        }
        return ids;
    }

    private void quick_sort(int l, int r, int[][] restaurants) {
        if (l < r) {
            int i = l, j = r;
            int[] m = restaurants[l];
            while (i < j) {
                while (i < j && compare(m, restaurants[j]) <= 0) {
                    j--;
                }
                if (i < j) {
                    restaurants[i++] = restaurants[j];
                }
                while (i < j && compare(m, restaurants[i]) > 0) {
                    i++;
                }
                if (i < j) {
                    restaurants[j--] = restaurants[i];
                }
            }
            restaurants[i] = m;
            quick_sort(l, i - 1, restaurants);
            quick_sort(i + 1, r, restaurants);
        }
    }

    private int compare(int[] restaurant1, int[] restaurant2) {
        if (restaurant1[1] < restaurant2[1]) {
            return 1;
        } else if (restaurant1[1] == restaurant2[1]) {
            if (restaurant1[0] < restaurant2[0]) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

}
