public class FutureValueCalculator {


    public static double calculateFutureValue(double initialValue, double[] growthRates, int year) {
        if (year <= 0) {
            return initialValue;
        }

        double previousYearValue = calculateFutureValue(initialValue, growthRates, year - 1);
        double currentYearRate = growthRates[year - 1];

        return previousYearValue * (1 + currentYearRate);
    }
}