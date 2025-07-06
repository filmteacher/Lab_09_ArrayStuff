import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author matt.bennett@uc.edu
 */

public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random();

        // Part 1
        // Task 1
        // Declare an array of type int named dataPoints
        int ARRAY_SIZE = 100; //avoid magic numbers, use a symbolic constant - you can easily change
        int[] dataPoints = new int[ARRAY_SIZE];  // index 0 - 99

        // Task 2
        //Initialize the array with random values from 1 - 100
        for(int e = 0; e < dataPoints.length; e++)
        {
            dataPoints[e] = rnd.nextInt(100) + 1;
        }

        // Task 3
        // Print values formatted with " | " between each
        for(int i = 0; i < ARRAY_SIZE; i++)
        {
            System.out.print(dataPoints[i] + " | ");
        }

        // Task 4
        // Calculate the sum and average of the values in dataPoints
        int sum = 0;
        for(int e = 0; e < dataPoints.length; e++)
        {
            sum = sum + dataPoints[e];
        }

        int average = sum / dataPoints.length;

        System.out.println("\n\nThe sum of the values in dataPoints is " + sum + ".");
        System.out.println("The average of the values is " + average + ".");

        // Part 2: Linear scan (search)
        // Task 5
        // Prompt user for int between 1 and 100 using SafeInput
        Scanner in = new Scanner(System.in);
        int searchTarget = 0;
        searchTarget = SafeInput.getRangedInt(in, "Input an integer value", 1, 100);
        boolean foundTarget = false;

        // Task 6
        // Count how many times the user's value is found in the array
        for(int e = 0; e < dataPoints.length; e++)
        {
            if(dataPoints[e] == searchTarget)
            {
                foundTarget = true;
                System.out.println("Found your value " + searchTarget + " at index " + e + ".");
            }
        }
        if(!foundTarget)
        {
            System.out.println("Your value " + searchTarget + " was not found.");
        }
        foundTarget = false;

        // Task 7
        // Search for user's value, but short circuit when found first time
        searchTarget = 0;
        searchTarget = SafeInput.getRangedInt(in, "Input another integer value", 1, 100);
        foundTarget = false;

        for(int e = 0; e < dataPoints.length; e++)
        {
            if(dataPoints[e] == searchTarget)
            {
                foundTarget = true;
                System.out.println("Found your value " + searchTarget + " at index " + e + ". Breaking now.");
                break;
            }
        }
        if(!foundTarget)
        {
            System.out.println("Your value " + searchTarget + " was not found.");
        }

        // Task 8
        // Find the minimum and maximum values in the array
        int min = dataPoints[0];
        int max = dataPoints[0];

        for(int e = 0; e < dataPoints.length; e++)
        {
            if(min > dataPoints[e])
            {
                min = dataPoints[e];
            }
            if(max < dataPoints[e])
            {
                max = dataPoints[e];
            }
        }
        System.out.println("\nThe minimum value in the array is " + min +".");
        System.out.println("The maximum value in the array is " + max + ".");

        // Task 9
        // Find average of an array of double values by calling a static method
        // Reset the array with random doubles from 1 - 100
        double[] dataDoubles = new double[100];  // index 0 - 99
        for(int e = 0; e < dataDoubles.length; e++)
        {
            dataDoubles[e] = 1.0 + (rnd.nextDouble() * (99.0));;
        }
        System.out.println("\nAverage of values in dataDoubles array is: " + getAverage(dataDoubles));
    }

    // Method to find average of an array of double values passed to it
    public static double getAverage(double values[])
    {
        double sum = 0;
        for(int e = 0; e < values.length; e++)
        {
            sum = sum + values[e];
        }

        double average = sum / values.length;
        return average;
    }

}