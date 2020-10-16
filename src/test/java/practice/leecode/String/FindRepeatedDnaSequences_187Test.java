package practice.leecode.String;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FindRepeatedDnaSequences_187Test {

    @Test
    public void findRepeatedDnaSequences_1() {
        List<String> expect = new ArrayList<>();
        expect.add("AAAAACCCCC");
        expect.add("CCCCCAAAAA");

        FindRepeatedDnaSequences_187 findRepeatedDnaSequences_187 = new FindRepeatedDnaSequences_187();
        List<String> result = findRepeatedDnaSequences_187.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");

        assertEquals(expect.get(0), result.get(0));
        assertEquals(expect.get(1), result.get(1));
    }

    @Test
    public void findRepeatedDnaSequences_2() {
        List<String> expect = new ArrayList<>();
        expect.add("AAAAAAAAAA");

        FindRepeatedDnaSequences_187 findRepeatedDnaSequences_187 = new FindRepeatedDnaSequences_187();
        List<String> result = findRepeatedDnaSequences_187.findRepeatedDnaSequences("AAAAAAAAAAAAA");

        assertEquals(expect.get(0), result.get(0));
    }

    @Test
    public void findRepeatedDnaSequences_3() {
        List<String> expect = new ArrayList<>();
        expect.add("AAAAAAAAAA");

        FindRepeatedDnaSequences_187 findRepeatedDnaSequences_187 = new FindRepeatedDnaSequences_187();
        List<String> result = findRepeatedDnaSequences_187.findRepeatedDnaSequences("AAAAAAAAAAA");

        assertEquals(expect.get(0), result.get(0));
    }

}