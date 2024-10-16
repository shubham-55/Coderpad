package gs.coderpad.practice;

public class LengthOfCycle {
    public static void main(String[] args) {
        int[] arr={1,0};
        int index=0;
        System.out.println(lengthOfCycle(arr,index));
    }

    public static int lengthOfCycle(int[] arr, int index) {
        int count=1;
        if(arr==null || arr.length==0 || index<0 || index>arr.length){
            return -1;
        }
        int slow=index;
        int fast=index;
        do{
            slow=arr[slow];
            if(fast<arr.length){
                fast=arr[fast];
                if(fast<arr.length){
                    fast=arr[fast];
                }
            } else {
                return -1;
            }
        }while(slow !=fast && fast<arr.length);
        //no cycle
        if(slow !=fast){
            return -1;
        }
        int current= arr[slow];
        if(current==slow){
            return 1;
        }
        while(current !=slow){
            current=arr[current];
            count++;
        }
        return count;
    }
}
