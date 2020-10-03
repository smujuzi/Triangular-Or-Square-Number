package com.example.stuart.appnumbershapes;



/**
 * Created by Stuart on 16/05/2020.
 */

public class Number {
    private int number;

    public Number(int number)
    {
        this.number = number;
    }

    public String Triangular()
    {
        int nOne;
        int nTwo;
        int result;
        int cumulative = 0;
        int T = number;

        nOne = (int) (( -1 + Math.sqrt( 1 + (8*T) ) ) / 2);
        nTwo = (int) (( -1 - Math.sqrt( 1 + (8*T) ) ) / 2);

        if( nOne > nTwo)
        {
            result = nOne;
        }
        else
        {
            result = nTwo;
        }

        for(int i = 1; i <= result; i++)
        {
            cumulative = cumulative + i;
        }

        if(cumulative == number)
        {
            return "This is a triangular number";
        }
        else
        {
            return "This is NOT a triangular number";
        }

    }

    public String Square()
    {
        double result = Math.sqrt(number);
        int rounded = (int) result;

        if(result == rounded)
        {
            return "This is a square number";
        }
        else
        {
            return "This is NOT a square number";
        }
    }


}
