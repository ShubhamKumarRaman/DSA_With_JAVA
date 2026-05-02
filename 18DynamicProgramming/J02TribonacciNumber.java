public class J02TribonacciNumber {
    // Using recursion
    public static int usingRecursion(int n){
        if(n==0 || n==1 || n==2){
            return 0;
        }
        if(n==3){
            return 1;
        }

        return usingRecursion(n-1)+usingRecursion(n-2)+usingRecursion(n-3);
    }

    public static void main(String args[]){
        int n = 10;
        int result = usingRecursion(n);
        System.out.println("Tribonacci Number : "+result);
    }
}
