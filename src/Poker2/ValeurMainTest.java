package Poker2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValeurMainTest {

    @Test
    public void meilleur_que() {
        ValeurMain main1 = new ValeurMain(2, 2, 2, 2, 2, 2);
        ValeurMain main2 = new ValeurMain(2, 2, 2, 2, 2, 1);
        ValeurMain main3 = new ValeurMain(1, 3, 3, 3, 3, 3);
        assertEquals(main1.meilleur_que(main1), 0);
        assertEquals(main1.meilleur_que(main2), 1);
        assertEquals(main1.meilleur_que(main3), 1);
        assertEquals(main3.meilleur_que(main1), -1);
    }
}