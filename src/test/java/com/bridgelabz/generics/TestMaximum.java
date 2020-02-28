package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMaximum {
    TestMaximumProblem testMaximumProblem;

    @Before
    public void setUp() throws Exception {
        testMaximumProblem = new TestMaximumProblem();
    }

    @Test
    public void givenMaxIntegerNumberAtFirstPosition_WhenProper_ShouldReturnTrue() {
        int maximumNumber = testMaximumProblem.findMaximumNumber(5,3,1);
        Assert.assertEquals(5,maximumNumber);
    }

    @Test
    public void givenMaxIntegerNumberAtSecondPosition_WhenProper_ShouldReturnTrue() {
        int maximumNumber = testMaximumProblem.findMaximumNumber(3,5,1);
        Assert.assertEquals(5,maximumNumber);
    }
    @Test
    public void givenMaxIntegerNumberAtThirdPosition_WhenProper_ShouldReturnTrue() {
        int maximumNumber = testMaximumProblem.findMaximumNumber(3,5,15);
        Assert.assertEquals(15,maximumNumber);
    }

    @Test
    public void givenMaxFloatNumberInIntegerAtFirstPosition_WhenProper_ShouldReturnTrue() {
        Float maximumNumber = testMaximumProblem.findMaximumNumber(5.0f,3.0f,1.2f);
        Assert.assertEquals(5,maximumNumber,0.0);
    }
    @Test
    public void givenMaxFloatNumberAtSecondPosition_WhenProper_ShouldReturnTrue() {
        Float maximumNumber = testMaximumProblem.findMaximumNumber(3.0f,5.0f,1.0f);
        Assert.assertEquals(5,maximumNumber,0.0);
    }
    @Test
    public void givenMaxFloatNumberAtThirdPosition_WhenProper_ShouldReturnTrue() {
        Float maximumNumber = testMaximumProblem.findMaximumNumber(3.0f, 5.0f, 15.0f);
        Assert.assertEquals(15, maximumNumber,0.0);
    }


}
