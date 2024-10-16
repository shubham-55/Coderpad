package gs.coderpad.collection;

public class CycleLength {
    public static void main(String[] args) {
        System.out.println(findCycleLength(new int[]{}, 0)); // Expected: -1
        System.out.println(findCycleLength(new int[]{0}, 0)); // Expected: 1
        System.out.println(findCycleLength(new int[]{1, 2}, 0)); // Expected: -1
        System.out.println(findCycleLength(new int[]{1, 0}, 0)); // Expected: 2
        System.out.println(findCycleLength(new int[]{1, 2, 3, 0}, 0)); // Expected: 4
        System.out.println(findCycleLength(new int[]{1, 2, 0, 4, 3}, 0)); // Expected: 3
        System.out.println(findCycleLength(new int[]{0, 1, 2, 3}, 0)); // Expected: -1
        System.out.println(findCycleLength(new int[]{1, 2, 3, 4, 5, 1}, 0)); // Expected: 5
        System.out.println(findCycleLength(new int[]{1, 2, 3}, 5)); // Expected: -1
        System.out.println(findCycleLength(new int[]{1, 2, 3, 4, 5, 0}, 0)); // Expected: 6
        System.out.println(findCycleLength(new int[]{0, 0, 0}, 0)); // Expected: 1
    }

    public static int findCycleLength(int[] arr,int startInd) {
        if(arr==null || arr.length==0 || startInd < 0 || arr.length<=startInd){
            return -1;
        }
        int slow=startInd;
        int fast=startInd;
        do{
            slow=arr[slow];
            if(fast<arr.length){
                fast=arr[fast];
                if(fast<arr.length){
                    fast=arr[fast];
                }
            }else{
                return -1;
            }
        }while (slow != fast && fast < arr.length);

        // If there was no cycle
        if (slow != fast) {
            return -1; // No cycle found
        }

        int cycleLength = 1;
        int current = arr[slow];
        // Check for self-pointing case
        if (slow == arr[slow]) {
            return 1; // Return 1 if it points to itself
        }
        while (current != slow) {
            current = arr[current];
            cycleLength++;
        }

        return cycleLength;

    }
}
