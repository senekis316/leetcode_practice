package practice.leecode.Sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class FilterRestaurants_1333Test {

    @Test
    public void filterRestaurants_1() {
        int[][] restaurants = {{1,4,1,40,10},{2,8,0,50,5},{3,8,1,30,4},{4,10,0,10,3},{5,1,1,15,1}};
        int veganFriendly = 1;
        int maxPrice = 50;
        int maxDistance = 10;
        FilterRestaurants_1333 filterRestaurants_1333 = new FilterRestaurants_1333();
        assertArrayEquals(new int[]{3,1,5},
            filterRestaurants_1333.filterRestaurants(
                restaurants, veganFriendly, maxPrice, maxDistance)
                    .stream().mapToInt(Integer::valueOf).toArray());
    }

    @Test
    public void filterRestaurants_2() {
        int[][] restaurants = {{1,4,1,40,10},{2,8,0,50,5},{3,8,1,30,4},{4,10,0,10,3},{5,1,1,15,1}};
        int veganFriendly = 0;
        int maxPrice = 50;
        int maxDistance = 10;
        FilterRestaurants_1333 filterRestaurants_1333 = new FilterRestaurants_1333();
        assertArrayEquals(new int[]{4,3,2,1,5},
            filterRestaurants_1333.filterRestaurants(
                restaurants, veganFriendly, maxPrice, maxDistance)
                .stream().mapToInt(Integer::valueOf).toArray());
    }

    @Test
    public void filterRestaurants_3() {
        int[][] restaurants = {{1,4,1,40,10},{2,8,0,50,5},{3,8,1,30,4},{4,10,0,10,3},{5,1,1,15,1}};
        int veganFriendly = 0;
        int maxPrice = 30;
        int maxDistance = 3;
        FilterRestaurants_1333 filterRestaurants_1333 = new FilterRestaurants_1333();
        assertArrayEquals(new int[]{4,5},
            filterRestaurants_1333.filterRestaurants(
                restaurants, veganFriendly, maxPrice, maxDistance)
                .stream().mapToInt(Integer::valueOf).toArray());
    }

}