import java.util.Arrays;

public class Main {

    public static int numOfWaysToSum(int target, int sum, int memo[]) {
        if (sum > target) {
            return 0;
        }

        if (sum == target) {
            return 1;
        }

        if (memo[sum] != -1) {
            return memo[sum];
        }

        memo[sum] = numOfWaysToSum(target, sum + 1, memo)
                + numOfWaysToSum(target, sum + 5, memo)
                + numOfWaysToSum(target, sum + 10, memo)
                + numOfWaysToSum(target, sum + 25, memo);

        return memo[sum];
    }
v 
    public static void main(String[] args) {
        int target = 6;
        int[] memo = new int[target];
        Arrays.fill(memo, -1);

        System.out.println(numOfWaysToSum(target, 0, memo));
    }
}
