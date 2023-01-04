package _0x17_priorityQueue;

public class HeapImpl {

    static int [] heap = new int[100005];
    static int size = 0; // heap 에 들어있는 원소 수

    void push(int x) {
        heap[++size] = x;
        int index = size;
        while (index != 1) {
            int par = index/2;
            if (heap[par] <= heap[index]) break;
            swap(heap[par], heap[index]);
            index = par;
        }
    }

    private void swap(int a, int b) {

    }

    int top() {
        return heap[1];
    }

    void pop() {

    }

    void test() {

    }

    public static void main(String[] args) {
        new HeapImpl().test();
    }


}
