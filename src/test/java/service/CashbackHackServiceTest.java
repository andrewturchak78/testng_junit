package service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void remainIfUnder1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 200;
        int actual = service.remain(800);
        assertEquals(expected, actual);
    }
    @Test
    public void remainIfAbove1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1700);
        assertEquals(expected, actual);
    }
    @Test
    public void remainIf0() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(expected, actual);
    }
}