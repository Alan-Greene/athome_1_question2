package inclass_2;

import java.util.Scanner;

public class TestUtility {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TempUtility tu1 = new TempUtility();

        double[] temperatures = {10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0};

        double min, max, difference, average;
        int user_choice;

        min = tu1.min_temp(temperatures);
        max = tu1.max_temp(temperatures);
        difference = tu1.temp_range(temperatures);
        average = tu1.average_temp(temperatures);

        System.out.printf("Minimum temp: %.1f degrees %n", min);
        System.out.printf("Maximum temp: %.1f degrees %n", max);
        System.out.printf("Range temp: %.1f degrees %n", difference);
        System.out.printf("Average temp: %.1f degrees %n", average);

        tu1.print_temp(temperatures);

        System.out.println("Please enter the day number you wish to search for: ");
        user_choice = in.nextInt();

        tu1.print_day(temperatures, user_choice);
    }

}
