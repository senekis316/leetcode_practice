package practice.dajiang;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import practice.dajiang.BuyFoods.*;

import static org.junit.Assert.*;

public class BuyFoodsTest {

    @Test
    public void mostSatisfyDegree() {

        Budget budget1 = new Budget(2, 10);
        Food[] foods1 = new Food[2];
        foods1[0] = new Food(1, 1, 1);
        foods1[1] = new Food(1, 1, 1);

        assertEquals(2, new BuyFoods().mostSatisfyDegree(budget1, foods1));

        Budget budget2 = new Budget(3, 100);
        Food[] foods2 = new Food[3];
        foods2[0] = new Food(26, 100, 4);
        foods2[1] = new Food(5, 1, 4);
        foods2[2] = new Food(5, 2, 2);

        assertEquals(306, new BuyFoods().mostSatisfyDegree(budget2, foods2));


    }
}