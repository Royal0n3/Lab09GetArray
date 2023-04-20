import java.util.Random;

public class getArrayed {

    public static void main(String[] args) {

        // Declare an array of type int named dataPoints with length 100
        int[] dataPoints = new int[100];
        Random rnd = new Random();

        // Initialize each element in dataPoints to a random value between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Display the dataPoints values separated by " | "
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // Calculate the sum and average of the values in dataPoints and display them
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;

        System.out.printf("The sum of the random array dataPoints is: %d%n", sum);
        System.out.printf("The average of the random array dataPoints is: %.2f%n", average);

        // Prompt the user to input an integer value between 1 and 100 using SafeInput.getRangedInt() method
        int userInput = utilities.SafeInput.getRangedInt("Enter an integer value between 1 and 100: ", 1, 100);

        // Display the user input value
        System.out.printf("The user input value is: %d%n", userInput);

        // Count how many times the user's value is found within the dataPoints array
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInput) {
                count++;
            }
        }

        // Display the count of how many times the user's value was found within the dataPoints array
        System.out.printf("The user's value of %d was found %d times within the dataPoints array.%n", userInput, count);

        // Find the minimum and maximum values in the dataPoints array
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

        // Display the minimum and maximum values in the dataPoints array
        System.out.printf("The minimum value in the dataPoints array is: %d%n", min);
        System.out.printf("The maximum value in the dataPoints array is: %d%n", max);

        // Calculate the average of the values in dataPoints using the getAverage method and display it
        double dataPointsAverage = getAverage(dataPoints);
        System.out.printf("The average of the dataPoints array is: %.2f%n", dataPointsAverage);
    }

    public static double getAverage(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        double average = (double) sum / values.length;
        return average;
    }
}
