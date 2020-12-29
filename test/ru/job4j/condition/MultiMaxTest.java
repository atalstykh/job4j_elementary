package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(5, 4, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(4, 5, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenAllEqual() {
        int result = MultiMax.max(5, 5, 5);
        assertThat(result, is(5));
    }
}
