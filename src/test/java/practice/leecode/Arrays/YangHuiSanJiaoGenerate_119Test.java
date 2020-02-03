package practice.leecode.Arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class YangHuiSanJiaoGenerate_119Test {

    @Test
    public void getRow_1() {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        YangHuiSanJiaoGenerate_119 yangHuiSanJiaoGenerate_119 = new YangHuiSanJiaoGenerate_119();
        assertEquals(row, yangHuiSanJiaoGenerate_119.getRow(0));
    }

    @Test
    public void getRow_2() {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        row.add(1);

        YangHuiSanJiaoGenerate_119 yangHuiSanJiaoGenerate_119 = new YangHuiSanJiaoGenerate_119();
        assertEquals(row, yangHuiSanJiaoGenerate_119.getRow(1));
    }

    @Test
    public void getRow_3() {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        row.add(2);
        row.add(1);

        YangHuiSanJiaoGenerate_119 yangHuiSanJiaoGenerate_119 = new YangHuiSanJiaoGenerate_119();
        assertEquals(row, yangHuiSanJiaoGenerate_119.getRow(2));
    }

    @Test
    public void getRow_4() {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        row.add(3);
        row.add(3);
        row.add(1);

        YangHuiSanJiaoGenerate_119 yangHuiSanJiaoGenerate_119 = new YangHuiSanJiaoGenerate_119();
        assertEquals(row, yangHuiSanJiaoGenerate_119.getRow(3));
    }

    @Test
    public void getRow_5() {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        row.add(4);
        row.add(6);
        row.add(4);
        row.add(1);

        YangHuiSanJiaoGenerate_119 yangHuiSanJiaoGenerate_119 = new YangHuiSanJiaoGenerate_119();
        assertEquals(row, yangHuiSanJiaoGenerate_119.getRow(4));
    }

}