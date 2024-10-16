package gs.coderpad.lastDay;

public class PrintPermutation {
    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str, 0, str.length() - 1);
    }

    public static void printPermutation(String str, int left, int right) {
        if(left==right){
            System.out.println(str);
        }else{
            for(int i= left;i<=right;i++){
                str=swap(str,left,i);
                printPermutation(str,left+1,right);
                str=swap(str,left,i);
            }
        }
    }
    public static String swap(String str,int i, int j){
        char[] chars=str.toCharArray();
        char temp= chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
        return String.valueOf(chars);
    }
}
