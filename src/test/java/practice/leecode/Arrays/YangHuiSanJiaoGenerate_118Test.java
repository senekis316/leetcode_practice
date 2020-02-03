package practice.leecode.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class YangHuiSanJiaoGenerate_118Test {

    @Test
    public void generate() throws JsonProcessingException {
        YangHuiSanJiaoGenerate_118 yangHuiSanJiaoGenerate_118 = new YangHuiSanJiaoGenerate_118();
        List<List<Integer>> yhsj = yangHuiSanJiaoGenerate_118.generate(5);
        assertArrayEquals(new int[]{1}, yhsj.get(0).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{1,1}, yhsj.get(1).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{1,2,1}, yhsj.get(2).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{1,3,3,1}, yhsj.get(3).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{1,4,6,4,1}, yhsj.get(4).stream().mapToInt(Integer::intValue).toArray());
    }
}