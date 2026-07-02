public class Main {
    public static void main(String[] args) {
        double initialPrincipal = 10000.0;

        double[] historicRates = {0.05, 0.07, -0.02, 0.06};

        int predictionYears = historicRates.length;
        double finalValue = FutureValueCalculator.calculateFutureValue(initialPrincipal, historicRates, predictionYears);

        System.out.printf("Initial Value: $%,.2f%n", initialPrincipal);
        System.out.printf("Predicted Future Value after %d years: $%,.2f%n", predictionYears, finalValue);
    }
}
