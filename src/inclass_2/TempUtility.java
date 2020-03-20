package inclass_2;

public class TempUtility {

    private final String[] days_of_the_week = {"Monday", "Tuesday", "Wednesday",
    "Thursday", "Friday", "Saturday", "Sunday"};

    public double min_temp(double[] temps) {
        int min_index = 0;

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] < temps[min_index]) {
                min_index = i;
            }
        }
        return temps[min_index];
    }

    public double max_temp(double[] temps){
        int max_index = 0;

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > temps[max_index]) {
                max_index = i;
            }
        }
        return temps[max_index];
    }

    public double temp_range(double[] temps){
        return max_temp(temps) - min_temp(temps);
    }

    public double average_temp(double[] temps) {
        double total = 0.0;

        for (double temp : temps) {
            total += temp;
        }
        return total / temps.length;
    }

    public void print_temp(double[] temps){
        System.out.printf("%-10s %s%n", "Day", "Temp");
        System.out.println("_________________");
        for (int i = 0; i < temps.length; i++) {
            System.out.printf("%-10s %.2f%n", days_of_the_week[i], temps[i]);
        }
    }

    public void print_day(double[] temps, int day){
        System.out.printf("%-10s %s%n", "Day", "Temp");
        System.out.println("_________________");
        System.out.printf("%-10s %.2f%n", days_of_the_week[day - 1], temps[day - 1]);
    }
}






