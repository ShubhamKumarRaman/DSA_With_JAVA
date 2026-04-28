import java.util.ArrayList;
import java.util.Arrays;

public class J01RemoveOccurrence {
    public static int RemoveOccurrence(ArrayList<Integer> arr, int el) {
        int n = arr.size();
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) != el) {
                swap(arr, i, k);
                k++;
            }
        }
        return k;
    }

    public static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    //print list
    public static void printList(ArrayList<Integer> arr){
        int n = arr.size();
        for(int i = 0;i<n;i++){
            System.out.print(" -> "+arr.get(i));
        }
        System.out.println();
    }
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        arr.add(1);
        arr.add(3);
        arr.add(0);
        arr.add(2);
        arr.add(2);
        arr.add(4);
        arr.add(2);
        int ele = 2;

        printList(arr);
        System.out.println(RemoveOccurrence(arr, ele));
        printList(arr);
    }
}
