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
        int maximumNumber = testMaximumProblem.findMaximum(5,3,1);
        Assert.assertEquals(5,maximumNumber);
    }

    @Test
    public void givenMaxIntegerNumberAtSecondPosition_WhenProper_ShouldReturnTrue() {
        int maximumNumber = testMaximumProblem.findMaximum(3,5,1);
        Assert.assertEquals(5,maximumNumber);
    }
    @Test
    public void givenMaxIntegerNumberAtThirdPosition_WhenProper_ShouldReturnTrue() {
        int maximumNumber = testMaximumProblem.findMaximum(3,5,15);
        Assert.assertEquals(15,maximumNumber);
    }
    @Test
    public void givenMaxFloatNumberAtFirstPosition_WhenProper_ShouldReturnTrue() {
        Float maximumNumber = testMaximumProblem.findMaximum(5.0f,3.0f,1.2f);
        Assert.assertEquals(5,maximumNumber,0.0);
    }
    @Test
    public void givenMaxFloatNumberAtSecondPosition_WhenProper_ShouldReturnTrue() {
        Float maximumNumber = testMaximumProblem.findMaximum(3.0f,5.0f,1.0f);
        Assert.assertEquals(5,maximumNumber,0.0);
    }
    @Test
    public void givenMaxFloatNumberAtThirdPosition_WhenProper_ShouldReturnTrue() {
        Float maximumNumber = testMaximumProblem.findMaximum(3.0f, 5.0f, 15.0f);
        Assert.assertEquals(15, maximumNumber,0.0);
    }


    @Test
    public void givenMaxStringAtFirstPosition_WhenProper_ShouldReturnTrue() {
        String maximumString = testMaximumProblem.findMaximum("peach", "apple", "banana");
        Assert.assertEquals("peach",maximumString);
    }
    @Test
    public void givenMaxStringAtSecondPosition_WhenProper_ShouldReturnTrue() {
        String maximumString = testMaximumProblem.findMaximum("apple","peach","banana");
        Assert.assertEquals("peach",maximumString);
    }
    @Test
    public void givenMaxStringAtThirdPosition_WhenProper_ShouldReturnTrue() {
        String maximumString = testMaximumProblem.findMaximum("apple", "banana", "peach");
        Assert.assertEquals("peach", maximumString);
    }
}
