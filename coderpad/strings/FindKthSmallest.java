package gs.coderpad.strings;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthSmallest {
    public static void main(String[] args) {
        int[] array = {12, 3, 5, 7, 19, 4, 8, 1};
        int k = 3;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : array) {
            if (maxHeap.size() < k) {
                maxHeap.add(num);
            } else if (num < maxHeap.peek()) {
                    maxHeap.poll();
                    maxHeap.add(num);
            }
        }
        System.out.println( maxHeap.peek());
    }
}

