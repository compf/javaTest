package org.example.dogData;

import org.example.interfaces.AgeChecker;
import org.example.personData.PersonHelper;

import java.util.Calendar;

public class DogHelper implements AgeChecker {
    public boolean isAdult(int birthYear,int birthMonth,int birthDay) {
       birthYear=birthYear-(birthYear- Calendar.getInstance().get(Calendar.YEAR))*7;
       return new PersonHelper().isAdult(birthYear,birthMonth,birthDay);
    }
}
