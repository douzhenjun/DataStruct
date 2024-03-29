package 动态规划.动态规划求一个字符串是否是另一个字符串的子串问题;

public class JudgeIfSubString {
    public boolean isSubsequence(String s, String t){
        if(s.length() == 0){
            return true;
        }
        boolean[][] dp = new boolean[s.length() + 1][t.length() + 1];
        //边界条件
        for(int i = 0; i < t.length(); i++){
            dp[0][i] = true;
        }
        for(int i = 1; i < s.length(); i++){
            for(int j = 1; j <= t.length(); j++){
                //递推公式
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        return dp[s.length()][t.length()];
    }
}
