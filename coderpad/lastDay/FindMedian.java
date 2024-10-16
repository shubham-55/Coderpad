package gs.coderpad.lastDay;

public class FindMedian {
    public static void main(String[] args) {
        int[] arr1={2,3,6,7,9};
        int[] arr2={-1,4,8,10};
        findMedian(arr1,arr2);
    }
    public static void findMedian(int[] arr1, int[] arr2){
        int l1= arr1.length;
        int l2= arr2.length;
        int[] mergedArray= new int[l1+l2];
        int i=0,j=0,k=0;
        while(i<l1 && j< l2){
            if(arr1[i]<arr2[j]){
                mergedArray[k++]=arr1[i++];
            } else {
                mergedArray[k++]=arr2[j++];
            }
        }
        while(i<l1){
            mergedArray[k++]=arr1[i++];
        }
        while(j<l2){
            mergedArray[k++]=arr2[j++];
        }
        int mid = (mergedArray.length-1)/2;
        System.out.println(mergedArray[mid]);
    }
}
