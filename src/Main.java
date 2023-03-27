import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Declare Variables
        Random rnd = new Random();
        int[] dataPoints;
        dataPoints = new int[100];
        int sum = 0;
        int average;

        //Get values
        for (int x = 0; x < dataPoints.length; x++) {
            dataPoints[x] = rnd.nextInt(100) + 1;
        }
        //Print values
        for (int x = 0; x < dataPoints.length; x++) {
            System.out.print(dataPoints[x] + " | ");
        }

        //Get sum
        for (int x = 0; x < dataPoints.length; x++) {
            sum = dataPoints[x] + sum;
        }

        average = sum / dataPoints.length;

        System.out.println();
        System.out.println("The sum of the values in the array is " + sum);
        System.out.println("The average of the values in the array is " + average);


        //Declare new Variables
        Scanner sc = new Scanner(System.in);

        int userInt = 0;

        int match = 0;

        //Get user input
        userInt = SafeInput.getRangedInt(sc, "Enter a number 1 - 100", 1, 100);

        //find matches
        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] == userInt) {
                match++;
            }
        }

        //Print matches
        if (match == 1)
        {
            System.out.println("The array found " + match + " match.");
        }
        else
        {
            System.out.println("The array found " + match + " matches.");
        }

        //Declare variables
        int userInt2 = 0;

        int match2 = 0;

        userInt2 = SafeInput.getRangedInt(sc, "Enter a number 1 - 100", 1, 100);

        //find position of match

        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] == userInt2)
            {
                match2 = x;
                break;
            }
        }

        if(match2 == 0)
        {
            System.out.println("Your value has zero matches.");
        }
        else
        {
            System.out.println("The value " + userInt2 + " was found at array index position " + match2);
        }

        int max = 0;
        int min = 100;


        //find min and max
        for (int x = 0; x < dataPoints.length; x++)
        {
            if (dataPoints[x] < min)
            {
                min = dataPoints[x];
            }

            if(dataPoints[x] > max)
            {
                max = dataPoints[x];
            }
        }

        //Print min and max
        System.out.println("The max of the array is " + max);

        System.out.println("The min of the array is " + min);

        //get average in double

        System.out.println("Average of dataPoints is "+  getAverage(dataPoints));




    }
    public static double getAverage(int values[])
    {
        double average = 0;
        double sum2 = 0;
        {
            for (int x = 0; x < values.length; x++) {
                sum2 = sum2 + values[x];
            }
        }
        average = sum2 / values.length;

        return average;
    }
}