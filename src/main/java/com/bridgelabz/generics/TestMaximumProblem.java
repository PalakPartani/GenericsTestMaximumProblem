package com.bridgelabz.generics;

public class TestMaximumProblem {

    public Integer findMaximumNumber(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maximumValue = firstNumber;
        if (secondNumber.compareTo(maximumValue)>0) {
            maximumValue = secondNumber;
        }
        if(thirdNumber.compareTo(maximumValue)>0) {
            maximumValue=thirdNumber;
        }
        return maximumValue;
    }
    public Float findMaximumNumber(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float maximumValue = firstNumber;
        if (secondNumber.compareTo(maximumValue)>0) {
            maximumValue = secondNumber;
        }
        if(thirdNumber.compareTo(maximumValue)>0) {
            maximumValue=thirdNumber;
        }
        return maximumValue;
    }

    public String findMaximumString(String firstString, String secondString, String thirdString) {
        String maximumValue = firstString;
        if (secondString.compareTo(maximumValue)>0) {
            maximumValue = secondString;
        }
        if(thirdString.compareTo(maximumValue)>0) {
            maximumValue=thirdString;
        }
        return maximumValue;
    }

}
