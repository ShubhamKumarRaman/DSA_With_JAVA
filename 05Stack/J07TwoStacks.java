public class J07TwoStacks {
    int arr[];
    int size;
    int top1, top2;

    public J07TwoStacks(int size) {
        this.size = size;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    void push1(int data) {
        if (top1 + 1 == top2) {
            System.out.println("Stack Overflow!");
            return;
        }
        top1++;
        arr[top1] = data;
    }

    int pop1() {
        if (top1 == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int data = arr[top1];
        top1--;
        return data;
    }

    void push2(int data) {
        if (top2 == top1 + 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        top2--;
        arr[top2] = data;
    }

    int pop2() {
        if (top2 == size) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int data = arr[top2];
        top2++;
        return data;
    }

    public static void main(String args[]) {
        J07TwoStacks ts = new J07TwoStacks(10);
        ts.push1(2);
        ts.push1(3);
        ts.push2(4);
        System.out.println(ts.pop1() + " ");
        System.out.println(ts.pop2() + " ");
        System.out.println(ts.pop2() + " ");
    }
}
