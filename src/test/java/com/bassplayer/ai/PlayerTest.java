package com.bassplayer.ai;

import com.bassplayer.ai.Player;
import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {

    @Test
    public void test() {
        Player p = new Player("1加1为2", "1加2为3");
        System.err.println(p.compare());
        Assert.assertEquals(1D, p.compare(), 0.1D);
    }
}
