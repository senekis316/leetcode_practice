package practice.leecode.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class GoodDaysToRobBank_2100Test {

    @Test
    public void goodDaysToRobBank_1() {
        GoodDaysToRobBank_2100 goodDaysToRobBank_2100 = new GoodDaysToRobBank_2100();
        assertArrayEquals(new int[]{2,3}, goodDaysToRobBank_2100.goodDaysToRobBank(
            new int[]{5,3,3,3,5,6,2}, 2).stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void goodDaysToRobBank_2() {
        GoodDaysToRobBank_2100 goodDaysToRobBank_2100 = new GoodDaysToRobBank_2100();
        assertArrayEquals(new int[]{0,1,2,3,4}, goodDaysToRobBank_2100.goodDaysToRobBank(
            new int[]{1,1,1,1,1}, 0).stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void goodDaysToRobBank_3() {
        GoodDaysToRobBank_2100 goodDaysToRobBank_2100 = new GoodDaysToRobBank_2100();
        assertArrayEquals(new int[]{}, goodDaysToRobBank_2100.goodDaysToRobBank(
            new int[]{1,2,3,4,5,6}, 2).stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void goodDaysToRobBank_4() {
        GoodDaysToRobBank_2100 goodDaysToRobBank_2100 = new GoodDaysToRobBank_2100();
        assertArrayEquals(new int[]{}, goodDaysToRobBank_2100.goodDaysToRobBank(
            new int[]{1}, 5).stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void goodDaysToRobBank_5() {
        GoodDaysToRobBank_2100 goodDaysToRobBank_2100 = new GoodDaysToRobBank_2100();
        assertArrayEquals(new int[]{5,10,14}, goodDaysToRobBank_2100.goodDaysToRobBank(
            new int[]{1,2,5,4,1,0,2,4,5,3,1,2,4,3,2,4,8}, 2).stream().mapToInt(Integer::intValue).toArray());
    }

}