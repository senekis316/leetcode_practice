package practice.leecode.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsOneBitCharacter_717Test {

    @Test
    public void isOneBitCharacter_1() {
        IsOneBitCharacter_717 IsOneBitCharacter_717 = new IsOneBitCharacter_717();
        assertTrue(IsOneBitCharacter_717.isOneBitCharacter(new int[]{1,0,0}));
    }

    @Test
    public void isOneBitCharacter_2() {
        IsOneBitCharacter_717 IsOneBitCharacter_717 = new IsOneBitCharacter_717();
        assertFalse(IsOneBitCharacter_717.isOneBitCharacter(new int[]{1,1,1,0}));
    }

    @Test
    public void isOneBitCharacter_3() {
        IsOneBitCharacter_717 IsOneBitCharacter_717 = new IsOneBitCharacter_717();
        assertTrue(IsOneBitCharacter_717.isOneBitCharacter(new int[]{1,1,0}));
    }

}