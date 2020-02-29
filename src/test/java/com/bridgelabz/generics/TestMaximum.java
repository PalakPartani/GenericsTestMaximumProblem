package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMaximum {

    @Test
    public void givenMaxIntegerNumberAtFirstPosition_WhenProper_ShouldReturnSameNumber() {
        Comparable maximumNumber = new TestMaximumProblem(5,3,2).findMaximum();
        Assert.assertEquals(5,maximumNumber);
    }

    @Test
    public void givenMaxIntegerNumberAtSecondPosition_WhenProper_ShouldReturnSameNumber() {
        Comparable maximumNumber = new TestMaximumProblem(3,15,1).findMaximum();
        Assert.assertEquals(15,maximumNumber);
    }
    @Test
    public void givenMaxIntegerNumberAtThirdPosition_WhenProper_ShouldReturnSameNumber() {
        Comparable maximumNumber = new TestMaximumProblem(1,2,3).findMaximum();
        Assert.assertEquals(3,maximumNumber);
    }
    @Test
    public void givenMaxFloatNumberAtFirstPosition_WhenProper_ShouldReturnSameNumber() {
        Comparable maximumNumber = new TestMaximumProblem(5.5,2.2,1.0).findMaximum();
        Assert.assertEquals(5.5,maximumNumber);
    }
    @Test
    public void givenMaxFloatNumberAtSecondPosition_WhenProper_ShouldReturnSameNumber() {
        Comparable maximumNumber = new TestMaximumProblem(1.0,5.0,1.1).findMaximum();
        Assert.assertEquals(5.0,maximumNumber);
    }
    @Test
    public void givenMaxFloatNumberAtThirdPosition_WhenProper_ShouldReturnSameNumber() {
        Comparable maximumNumber = new TestMaximumProblem(1.0,2.3,6.0).findMaximum();
        Assert.assertEquals(6.0, maximumNumber);
    }

    @Test
    public void givenMaxStringAtFirstPosition_WhenProper_ShouldReturnSameString() {
        Comparable maximumString = new TestMaximumProblem("peach","apple","banana").findMaximum();
        Assert.assertEquals("peach",maximumString);
    }

    @Test
    public void givenMaxStringAtSecondPosition_WhenProper_ShouldReturnSameString() {
        Comparable maximumString = new TestMaximumProblem("apple","peach","banana").findMaximum();
        Assert.assertEquals("peach",maximumString);
    }

    @Test
    public void givenMaxStringAtThirdPosition_WhenProper_ShouldReturnSameString() {
        Comparable maximumString = new TestMaximumProblem("apple","banana","peach").findMaximum();
        Assert.assertEquals("peach", maximumString);
    }

    @Test
    public void givenMaxIntegerNumberAtFirstPosition_WhenProperWithMultipleValues_ShouldReturnSameNumber() {
        Comparable maximumNumber = new TestMaximumProblem(5,3,2,4).findMaximum();
        Assert.assertEquals(5,maximumNumber);
    }

    @Test
    public void givenMaxFloatNumberAtFirstPosition_WhenProperWithMultipleValues_ShouldReturnSameNumber() {
        Comparable maximumNumber = new TestMaximumProblem(5.5,2.2,1.0,3.2).findMaximum();
        Assert.assertEquals(5.5,maximumNumber);
    }
    @Test
    public void givenMaxStringAtFirstPosition_WhenProperWithMultipleValues_ShouldReturnSameString() {
        Comparable maximumString = new TestMaximumProblem("peach","apple","banana","orange").findMaximum();
        Assert.assertEquals("peach",maximumString);
    }
}
