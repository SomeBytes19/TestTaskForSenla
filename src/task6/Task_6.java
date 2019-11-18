package task6;

public class Task_6 {
    public static void main(String[] args) {
        int[] weights={1,2,4,2,1};
        int[] costs={600,5000,1500,40000,500};
        int maxWeight=8;
        System.out.println("Максимально можно поместить на "+findBackPack(weights,costs,maxWeight));
    }

    public static int findBackPack(int[] weights, int[] costs, int maxWeight) {
        int n = weights.length;
        int dp[][] = new int[maxWeight + 1][n + 1];
        for (int j = 1; j <= n; j++) {
            for (int w = 1; w <= maxWeight; w++) {
                if (weights[j-1] <= w) {
                    dp[w][j] = Math.max(dp[w][j - 1], dp[w - weights[j-1]][j - 1] + costs[j-1]);
                } else {
                    dp[w][j] = dp[w][j - 1];
                }
            }
        }
        return dp[maxWeight][n];
    }

}
