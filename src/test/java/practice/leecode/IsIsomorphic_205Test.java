package practice.leecode;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsIsomorphic_205Test {

    @Test
    public void isIsomorphic() {
        IsIsomorphic_205 isIsomorphic_205 = new IsIsomorphic_205();
        assertEquals(false, isIsomorphic_205.isIsomorphic("ab", "aa"));
        assertEquals(true, isIsomorphic_205.isIsomorphic("paper", "title"));
        assertEquals(true, isIsomorphic_205.isIsomorphic("egg", "add"));
        assertEquals(false, isIsomorphic_205.isIsomorphic("foo", "bar"));
    }
}