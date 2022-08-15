package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax50To20Then50() {
        int left = 50;
        int right = 20;
        int result = Max.max(left, right);
        int expected = 50;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax15To131Then131() {
        int left = 15;
        int right = 131;
        int result = Max.max(left, right);
        int expected = 131;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax14To14Then14() {
        int left = 14;
        int right = 14;
        int result = Max.max(left, right);
        int expected = 14;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when1to2to3then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when3To7To8To10Then10() {
        int first = 3;
        int second = 7;
        int third = 8;
        int fourth = 10;
        int result = Max.max(first, second, third, fourth);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}