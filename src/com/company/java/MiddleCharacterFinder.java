/*
    Created by Md. Shahariar Hafiz
    Problem to find the middle character of a given word
    if its odd then give the middle one and if its even
    then give the middle two
 */
package com.company.java;

import java.util.Scanner;

public class MiddleCharacterFinder
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("====== Enter The Word ======");
	    String str = input.nextLine();
	    input.close();
	    if (str.length()%2==0) //Condition for checking that the word is even or not
        {
            int n = str.length()/2;
            String resultStringEven = str.substring(n-1,n+1);
            System.out.println("Even middle : "+resultStringEven);
        }
        else
        {
            int m = str.length()/2;
            String resultStringOdd =String.valueOf(str.charAt(m));
            System.out.println("Odd middle : "+resultStringOdd);
        }
    }
}
