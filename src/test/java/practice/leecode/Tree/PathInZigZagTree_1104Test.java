package practice.leecode.Tree;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.Test;

public class PathInZigZagTree_1104Test {

    @Test
    public void pathInZigZagTree_1() {
        PathInZigZagTree_1104 PathInZigZagTree_1104 = new PathInZigZagTree_1104();
        assertArrayEquals(new int[]{1,3,4,14}, PathInZigZagTree_1104.pathInZigZagTree(14).stream().mapToInt(Integer::valueOf).toArray());
    }

    @Test
    public void pathInZigZagTree_2() {
        PathInZigZagTree_1104 PathInZigZagTree_1104 = new PathInZigZagTree_1104();
        assertArrayEquals(new int[]{1,2,6,10,26}, PathInZigZagTree_1104.pathInZigZagTree(26).stream().mapToInt(Integer::valueOf).toArray());
    }
}