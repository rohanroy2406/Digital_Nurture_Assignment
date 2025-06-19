// File: FinancialForecast.java
public class FinancialForecast {

    // Recursive method to calculate future value
    public static double forecastRecursive(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return forecastRecursive(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Optimized version using memoization (optional)
    public static double forecastMemo(double currentValue, double growthRate, int years, double[] memo) {
        if (years == 0) {
            return currentValue;
        }
        if (memo[years] != 0) return memo[years];

        memo[years] = forecastMemo(currentValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }

    public static void main(String[] args) {
        double currentValue = 10000; // ₹10,000
        double annualGrowthRate = 0.08; // 8% per year
        int years = 5;

        double resultRecursive = forecastRecursive(currentValue, annualGrowthRate, years);
        System.out.printf("Recursive Forecast (%.0f%% growth for %d years): ₹%.2f\n", annualGrowthRate * 100, years, resultRecursive);

        // With memoization
        double[] memo = new double[years + 1];
        double resultMemo = forecastMemo(currentValue, annualGrowthRate, years, memo);
        System.out.printf("Optimized Forecast (Memoized): ₹%.2f\n", resultMemo);
    }
}
