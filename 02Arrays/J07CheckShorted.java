public class J07CheckShorted {
    public static boolean CheckShortedIterative(int arr[]) {
        if (arr.length == 0 || arr.length == 1) {
            return true;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int arr[] = { 20, 23, 23, 45, 78, 88 };
        System.out.println("arr:- "+CheckShortedIterative(arr));
        int arr2[] = {20, 20, 78, 98, 99, 97};
        System.out.println("arr2:- "+CheckShortedIterative(arr2));

    }
}
