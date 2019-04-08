package practice.leecode.Tencent.ArrayAndString;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsTest {

    @Test
    public void reverseWords() {

        ReverseWords reverseWords = new ReverseWords();
        System.out.println(reverseWords.reverseWords("Let's take LeetCode contest"));
        assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWords.reverseWords("Let's take LeetCode contest"));

    }
}