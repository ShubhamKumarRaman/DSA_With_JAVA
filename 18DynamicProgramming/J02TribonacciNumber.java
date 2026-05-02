public class J02TribonacciNumber {
    // Using recursion
    public static int usingRecursion(int n){
        if(n==0 || n==1){
            return 0;
        }
        if(n==2||n==3){
            return 1;
        }

        return usingRecursion(n-1)+usingRecursion(n-2)+usingRecursion(n-3);
    }

    // Using dp memoization
    public static int findTribonacci(int n){
        if(n==0)
            return 0;
        if(n==1 || n==2)
            return 1;

        int[] dp = new int[n+1];
        dp[1]=dp[2] = 1;

        for(int i = 3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }

    public static void main(String args[]){
        int n = 10;
        int result = usingRecursion(5);
        System.out.println("Tribonacci Number : "+result);

        System.out.println("Tribonacci Number : "+findTribonacci(5));
    }
}
