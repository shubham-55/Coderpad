package gs.coderpad.practice;

import static gs.coderpad.strings.GroupByAnagram.isAnagram;

public class Anagram {
    public static void main(String[] args) {
        String str="dog";
        String str1="god";
        System.out.println(checkAnagram(str,str1));
    }
    public static boolean checkAnagram(String str, String str1){
        char[] arr= new char[256];
        for(char c: str.toCharArray()){
            arr[c]++;
        }
        for(char c:str1.toCharArray()){
            arr[c]--;
        }
        System.out.println(arr.length);
        for(int i: arr){
            if(i!=0) {
                return false;
            }
        }
        return true;
    }
}
