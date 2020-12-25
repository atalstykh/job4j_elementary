package ru.job4j.calculator;
import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman180Then80() {
        short in = 180;
        double expected = 80.5;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenman176Then81() {
        short in = 176;
        double expected = 87.39;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}