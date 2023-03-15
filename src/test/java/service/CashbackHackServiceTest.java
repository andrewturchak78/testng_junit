package service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainIfUnder1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 300;
        int actual = service.remain(700);
        assertEquals(actual, expected);
    }
    @Test
    public void testRemainIf0() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }
    @Test
    public void testRemainIfAbove1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1200);
        assertEquals(actual, expected);
    }
}