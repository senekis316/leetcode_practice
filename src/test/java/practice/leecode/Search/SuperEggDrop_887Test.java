package practice.leecode.Search;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuperEggDrop_887Test {

    @Test
    public void superEggDrop() {
        SuperEggDrop_887 superEggDrop_887 = new SuperEggDrop_887();
        //assertEquals(2, superEggDrop_887.superEggDrop(1, 2));
        //assertEquals(2, superEggDrop_887.superEggDrop(2, 2));
        assertEquals(3, superEggDrop_887.superEggDrop(2, 4));
        assertEquals(3, superEggDrop_887.superEggDrop(2, 6));
        assertEquals(4, superEggDrop_887.superEggDrop(3, 14));
    }

}