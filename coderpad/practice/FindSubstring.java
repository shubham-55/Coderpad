package gs.coderpad.practice;

public class FindSubstring {
    public static void main(String[] args) {
        String str="padmaja";
        String str1="mej";
        System.out.println(checkSubString(str,str1));
    }
    public static boolean checkSubString(String str,String str1){
        if(str.length()>str1.length()){

        }
        for(int i=0; i<str.length()-str1.length();i++){
            int j;
            for(j=0;j<str1.length();j++){
                if(str.charAt(i+j) != str1.charAt(j)){
                    break;
                }
            }
            if(j==str1.length()){
                return true;
            }

        }
        return false;
    }
}
