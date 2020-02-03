package practice.leecode.LCP;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameLcp_1Test {

    @Test
    public void game_1() {
        GameLcp_1 GameLcp_1 = new GameLcp_1();
        assertEquals(3, GameLcp_1.game(new int[]{1,2,3}, new int[]{1,2,3}));
    }

    @Test
    public void game_2() {
        GameLcp_1 GameLcp_1 = new GameLcp_1();
        assertEquals(1, GameLcp_1.game(new int[]{2,2,3}, new int[]{3,2,1}));
    }

}