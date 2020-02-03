package practice.leecode.Arrays;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;

public class CommonChars_1002Test {

    @Test
    public void commonChars_1() {
        String[] except = new String[]{"e","l","l"};
        CommonChars_1002 CommonChars_1002 = new CommonChars_1002();
        List<String> res = CommonChars_1002.commonChars(new String[]{"bella","label","roller"});
        for (int i = 0; i < except.length; i++) {
            if (res.get(i) == except[i]) {
                assertEquals(except[i], res.get(i));
            }
        }
        assertEquals(except.length, res.size());
    }

    @Test
    public void commonChars_2() {
        String[] except = new String[]{"c","o"};
        CommonChars_1002 CommonChars_1002 = new CommonChars_1002();
        List<String> res = CommonChars_1002.commonChars(new String[]{"cool","lock","cook"});
        for (int i = 0; i < except.length; i++) {
            if (res.get(i) == except[i]) {
                assertEquals(except[i], res.get(i));
            }
        }
        assertEquals(except.length, res.size());
    }
}