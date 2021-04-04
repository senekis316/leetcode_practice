package practice.leecode.Dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class Answers_781Test {

    @Test
    public void numRabbits_1() {
        Answers_781 answers_781 = new Answers_781();
        assertEquals(5, answers_781.numRabbits(new int[]{1,1,2}));
    }

    @Test
    public void numRabbits_2() {
        Answers_781 answers_781 = new Answers_781();
        assertEquals(11, answers_781.numRabbits(new int[]{10,10,10}));
    }

    @Test
    public void numRabbits_3() {
        Answers_781 answers_781 = new Answers_781();
        assertEquals(0, answers_781.numRabbits(new int[]{}));
    }

}