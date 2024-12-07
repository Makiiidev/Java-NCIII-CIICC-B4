package TaskSheets;

public class Task_120 {
    public static void main(String[] args) {
        int total = calculateCumulativeSum(4,5,10);
        System.out.println();
        System.out.println("Total : " + total);
    }

    public static int calculateCumulativeSum(int... nums) {
        int totalSum = 0; 

        for (int num : nums) {
            int cumulativeSum = 0; // To hold the sum for the current parameter

            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
            }

            totalSum += cumulativeSum;

            System.out.println("Cumulative sum for " + num + ": " + cumulativeSum);
        }

        return totalSum;
    }
}
