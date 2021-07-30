
class Solution {
    public String stoneGameIII(int[] arr) {
        int score = minimax(arr, 0, 1, new Integer[arr.length][2]);
        if (score > 0) return "Alice";
        if (score < 0) return "Bob";
        return "Tie";
    }
    int minimax(int[] arr, int i, int maxPlayer, Integer[][] dp) {
        if (i >= arr.length) return 0;
        if (dp[i][maxPlayer] != null) return dp[i][maxPlayer];
        int ans = maxPlayer == 1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        int score = 0;
        for (int j = i; j < Math.min(arr.length, i + 3); j++) {
            if (maxPlayer == 1) {
                score += arr[j];
                ans = Math.max(ans, score + minimax(arr, j + 1, 0, dp));
            } else {
                score -= arr[j];
                ans = Math.min(ans, score + minimax(arr, j + 1, 1, dp));
            }
        }
        return dp[i][maxPlayer] = ans;
    }
}

Game theory concept used in Stone games questions.
//  Let's Alice be a maxPlayer and Bob be a minPlayer. On each turn, we need to maximize score of the maxPlayer and minimize score of the minPlayer. After all, we will check the final score. If score>0 Alice wins, score<0 Bob wins else they tie.
// More about detail Minimax: https://en.wikipedia.org/wiki/Minimax
