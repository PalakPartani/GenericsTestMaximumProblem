package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    @Test
    public void givenMaxNumberInIntegerAtFirstPosition_WhenProper_ShouldReturnTrue() {
        TestMaximumProblem testMaximumProblem = new TestMaximumProblem();
        int maximumNumber = testMaximumProblem.findMaximumNumber(5,3,1);
        Assert.assertEquals(5,maximumNumber);
        //System.out.println("Maximum Number is at first position :"+maxFind);
    }

    @Test
    public void givenMaxNumberAtSecondPositionInInteger_WhenProper_ShouldReturnTrue() {
        TestMaximumProblem testMaximumProblem = new TestMaximumProblem();
        int maximumNumber = testMaximumProblem.findMaximumNumber(3,5,1);
        Assert.assertEquals(5,maximumNumber);
    }
    @Test
    public void givenMaxNumberAtThirdPositionInInteger_WhenProper_ShouldReturnTrue() {
        TestMaximumProblem testMaximumProblem = new TestMaximumProblem();
        int maximumNumber = testMaximumProblem.findMaximumNumber(3,5,15);
        Assert.assertEquals(15,maximumNumber);
    }
}
