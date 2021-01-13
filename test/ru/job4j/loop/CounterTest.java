package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromThreeToEightThenEighteen() {
        int rsl = Counter.sumByEven(3, 8);
        int expected = 18;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToOneThenZero() {
        int rsl = Counter.sumByEven(1, 1);
        int expected = 0;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromFourToThreeThenZero() {
        int rsl = Counter.sumByEven(4, 3);
        int expected = 0;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromNTwoToSixThenTen() {
        int rsl = Counter.sumByEven(-2, 6);
        int expected = 10;
        assertThat(rsl, is(expected));
    }
}