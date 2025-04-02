public class J16SumSubArrays {
    public static int SubArraySum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i; j < n; j++) {
                temp += arr[j];
                sum += temp;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3 };
        System.out.println("Sum : " + SubArraySum(arr));
    }
}