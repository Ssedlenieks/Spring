package lv.rvt.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rvt.exercises.Money;

public class MoneyTest {

    @Test
    public void testPlusMethod(){
        Money mon1 = new Money(5, 10);
        Money mon2 = new Money(5, 10);

        Money result1 = mon1.plus(mon2);

        assertEquals(10, result1.euros());
        assertEquals(20, result1.cents());

        Money mon3 = new Money(2, 99);
        Money mon4 = new Money(3, 89);
        Money result2 = mon3.plus(mon4);

        assertEquals(6, result2.euros());
        assertEquals(88, result2.cents());
    }
}
