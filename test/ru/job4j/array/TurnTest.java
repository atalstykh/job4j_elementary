package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {2, 4, 6, 8, 10, 15, 3, 4, 9};
        int[] result = Turn.back(input);
        int[] expect = new int[] {9, 4, 3, 15, 10, 8, 6, 4, 2};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithManyEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] result = Turn.back(input);
        int[] expect = new int[] {20, 18, 16, 14, 12, 10, 8, 6, 4, 2};
        assertThat(result, is(expect));
    }

}