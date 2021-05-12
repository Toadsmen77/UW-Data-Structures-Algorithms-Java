package priorityqueues;

import priorityqueues.ArrayHeapMinPQ;

public class MyMinPQTests {

    public static void main(String[] args) {
        ArrayHeapMinPQ<Integer> testQ = new ArrayHeapMinPQ<>();
        for (int i = 0; i < 5; i++) {
            testQ.add(i, i);
        }

        testQ.changePriority(2, 5);
        testQ.removeMin();
        testQ.removeMin();








        testQ.printHeap();

    }

}
