package ru.AQA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialOfZero() {
        Assert.assertEquals(FactorialCalculator.factorial(0), 1);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        Assert.assertEquals(FactorialCalculator.factorial(1), 1);
        Assert.assertEquals(FactorialCalculator.factorial(2), 2);
        Assert.assertEquals(FactorialCalculator.factorial(3), 6);
        Assert.assertEquals(FactorialCalculator.factorial(4), 24);
        Assert.assertEquals(FactorialCalculator.factorial(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        FactorialCalculator.factorial(-1);
    }
}

