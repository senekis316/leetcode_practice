package practice.leecode.Dynamic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ShoppingOffers_638Test {

    @Test
    public void shoppingOffers_1() {
        List<Integer> needs = List.of(3,2);
        List<Integer> prices = List.of(2,5);
        List<List<Integer>> specials = new ArrayList<>();
        specials.add(List.of(3,0,5));
        specials.add(List.of(1,2,10));
        ShoppingOffers_638 shoppingOffers_638 = new ShoppingOffers_638();
        assertEquals(14, shoppingOffers_638.shoppingOffers(prices, specials, needs));
    }

    @Test
    public void shoppingOffers_2() {
        List<Integer> needs = List.of(1,2,1);
        List<Integer> prices = List.of(2,3,4);
        List<List<Integer>> specials = new ArrayList<>();
        specials.add(List.of(1,1,0,4));
        specials.add(List.of(2,2,1,9));
        ShoppingOffers_638 shoppingOffers_638 = new ShoppingOffers_638();
        assertEquals(11, shoppingOffers_638.shoppingOffers(prices, specials, needs));
    }

    @Test
    public void shoppingOffers_3() {
        List<Integer> needs = List.of(1,1,1);
        List<Integer> prices = List.of(0,0,0);
        List<List<Integer>> specials = new ArrayList<>();
        specials.add(List.of(1,1,0,4));
        specials.add(List.of(2,2,1,9));
        ShoppingOffers_638 shoppingOffers_638 = new ShoppingOffers_638();
        assertEquals(0, shoppingOffers_638.shoppingOffers(prices, specials, needs));
    }

    @Test
    public void shoppingOffers_4() {
        List<Integer> needs = List.of(3);
        List<Integer> prices = List.of(9);
        List<List<Integer>> specials = new ArrayList<>();
        specials.add(List.of(1,10));
        specials.add(List.of(2,2));
        ShoppingOffers_638 shoppingOffers_638 = new ShoppingOffers_638();
        assertEquals(11, shoppingOffers_638.shoppingOffers(prices, specials, needs));
    }

    @Test
    public void shoppingOffers_5() {
        List<Integer> needs = List.of(0,0,0);
        List<Integer> prices = List.of(2,3,4);
        List<List<Integer>> specials = new ArrayList<>();
        specials.add(List.of(1,1,0,4));
        specials.add(List.of(2,2,1,9));
        ShoppingOffers_638 shoppingOffers_638 = new ShoppingOffers_638();
        assertEquals(0, shoppingOffers_638.shoppingOffers(prices, specials, needs));
    }

    @Test
    public void shoppingOffers_6() {
        List<Integer> needs = List.of(1,1,0);
        List<Integer> prices = List.of(0,0,0);
        List<List<Integer>> specials = new ArrayList<>();
        specials.add(List.of(1,1,0,4));
        specials.add(List.of(2,2,1,9));
        ShoppingOffers_638 shoppingOffers_638 = new ShoppingOffers_638();
        assertEquals(0, shoppingOffers_638.shoppingOffers(prices, specials, needs));
    }

    @Test
    public void shoppingOffers_7() {
        List<Integer> needs = List.of(1,1,0);
        List<Integer> prices = List.of(0,0,0);
        List<List<Integer>> specials = new ArrayList<>();
        specials.add(List.of(1,1,0,4));
        specials.add(List.of(2,2,1,9));
        ShoppingOffers_638 shoppingOffers_638 = new ShoppingOffers_638();
        assertEquals(0, shoppingOffers_638.shoppingOffers(prices, specials, needs));
    }

//    @Test
//    public void shoppingOffers_5() {
//        List<Integer> needs = List.of(6,6,6,6,6,6);
//        List<Integer> prices = List.of(4,7,9,9,3,2);
//        List<List<Integer>> specials = new ArrayList<>();
//        specials.add(List.of(1,1,0,4));
//        specials.add(List.of(2,2,1,9));
//        [0,0,4,6,2,0,22],
//        [1,4,3,5,5,3,10],
//        [4,5,6,3,4,1,29],
//        [0,3,2,2,4,2,4],
//        [4,6,3,4,4,6,21],
//        [5,6,3,6,3,4,23],
//        [6,1,3,4,6,2,9],
//        [3,3,6,1,5,1,16],
//        [0,3,6,4,0,2,5],
//        [5,1,2,3,5,5,7],
//        [0,1,1,6,2,4,24],
//        [1,5,2,2,6,1,3],
//        [4,2,2,4,3,1,8],
//        [3,1,0,6,1,2,30],
//        [4,6,1,4,0,0,2],
//        [0,4,5,6,2,5,1],
//        [2,6,0,6,6,2,21],
//        [2,1,3,4,0,2,2],
//        [6,4,4,4,1,3,24],
//        [6,3,1,6,5,5,12],
//        [1,3,2,1,3,2,32],
//        [2,2,0,3,1,2,16],
//        [2,4,3,6,6,5,26],
//        [1,6,3,5,0,4,2],
//        [6,2,1,5,6,2,9],
//        [0,4,2,2,5,3,3],
//        [6,3,3,6,0,5,9],
//        [4,3,2,5,3,3,29],
//        [1,6,0,0,1,6,31],
//        [5,6,0,5,4,3,31],
//        [0,4,2,6,0,6,28],
//        [5,4,3,2,5,3,32],
//        [6,5,1,1,4,6,18],
//        [3,3,3,2,3,3,2],
//        [5,6,2,5,3,3,7],
//        [1,2,6,4,4,0,18],
//        [0,4,4,0,0,3,18],
//        [4,2,0,0,3,3,19],
//        [6,0,4,4,4,6,15],
//        [6,2,3,0,2,2,4],
//        [4,1,1,5,5,5,14],[3,6,4,0,6,2,27],[2,4,6,2,2,3,24],
//        [6,0,5,3,1,6,7],
//        [3,1,5,1,2,6,28],
//        [5,2,2,1,1,4,25],[5,6,5,0,3,4,19],
//        [3,5,3,3,5,1,31],
//        [6,0,1,1,6,4,14],[0,3,4,3,3,4,10],[4,1,2,2,0,0,27],
//        [2,2,1,3,5,2,24],[2,3,2,6,1,1,21],[6,6,5,6,2,2,12],[6,6,3,1,0,6,28],
//        [6,4,1,6,5,0,8],
//        [3,3,0,5,4,2,7],[4,3,3,3,0,2,25],[1,2,0,5,2,4,8],
//        [0,1,6,6,5,5,27],
//        [3,6,4,5,2,2,4],[4,4,6,1,5,3,30],
//        [4,3,4,5,5,5,19],
//        [0,0,0,6,1,0,27],[6,5,0,1,2,4,10],
//        [2,6,0,0,1,0,13],[4,1,6,1,4,1,24],
//        [2,4,0,1,4,1,25],[5,1,3,3,4,1,8],[5,5,1,0,2,1,25],[1,6,2,4,0,6,27],
//        [4,0,3,0,5,3,30],[2,4,6,6,3,2,4],[6,4,2,2,0,3,27],[1,2,1,2,2,1,2],
//        [2,0,3,0,5,4,4],[3,5,4,4,1,1,25],
//        [2,1,1,6,3,3,28],[4,4,4,3,6,3,21],
//        [1,4,1,4,2,2,27],[0,6,0,2,2,2,33],
//        [3,3,5,6,4,6,9],[1,0,0,3,4,2,11],
//        [1,3,0,3,0,1,16],[2,3,0,0,0,5,1],
//        [3,5,6,4,1,4,3],[3,1,0,2,6,0,19],
//        [3,0,0,5,3,1,6],[1,0,4,1,2,2,18],
//        [0,0,4,3,5,1,31],[4,4,2,5,5,2,2],
//        [5,0,2,6,5,3,4],[6,2,1,0,2,3,11],
//        [4,5,1,5,3,3,23],[6,2,5,1,6,6,4],
//        [5,6,6,1,5,6,6],[3,2,6,1,4,5,19],
//        [0,2,6,2,5,0,26],[0,1,3,6,3,6,18],[3,5,4,6,5,3,6]
//
//        ShoppingOffers_638 shoppingOffers_638 = new ShoppingOffers_638();
//        assertEquals(0, shoppingOffers_638.shoppingOffers(prices, specials, needs));
//    }

}