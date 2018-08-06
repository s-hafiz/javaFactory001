package com.company.java;

class HighestAndLowest
{
    static String highAndLow(String str)
    {
        String[] intString = str.split(" ");

        int[] integers = new int[intString.length];
        for (int i=0;i<integers.length;i++)
        {
            {
                integers[i] = Integer.parseInt(intString[i]);
            }
        }
        int max = getMax(integers);
        int min = getMin(integers);
        return max+" "+min;
    }

    private static int getMax(int[] inputArray)
    {
        int maxValue = inputArray[0];
        for (int anInputArray : inputArray) {
            if (anInputArray > maxValue) {
                maxValue = anInputArray;
            }
        }
        return maxValue;
    }
    private static int getMin(int[] inputArray)
    {
        int minValue=inputArray[0];
        for (int anInputArray : inputArray) {
            if (anInputArray < minValue)
            {
                minValue = anInputArray;
            }
        }
        return minValue;
    }
}
