package com.company;

public class LeapYear {
    //Method that checks if the given value is a Leap Year or not
    public static boolean isLeapYear(int year){
        //If given value is not between 1 - 9999 then return as false
        if(year < 1 || year > 9999){
            return false;
        } else{
            //If given value's remainder is equal to 0 after dividing by 4
            //Also checks if given value's remainder is not equal to 0 after dividing by 100
            //Then return true
            if(year % 4 == 0 && year % 100 != 0){
                return true;
            }else if(year % 400 == 0) {
                //If given value's remainder is equal to 0 after dividing by 400
                //Return true
                return true;
            }else{
                return false;
            }
        }

    }
}
