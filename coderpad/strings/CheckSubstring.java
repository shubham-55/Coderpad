package gs.coderpad.strings;

public class CheckSubstring {
    public static void main(String args[]){
        String str="padmaja";
        String str1="maj";
        System.out.println(isSubstring(str,str1));
    }
    public static boolean isSubstring(String str,String str1){
        int m=str1.length();
        int n=str.length();
        for(int i=0;i<=n-m;i++){
            int j;
            for( j=0;j<m;j++){
                if((str.charAt(i+j)!=str1.charAt(j))){
                    break;
                }
            }
            if(j==m){
                return true;
            }
        }
        return false;
    }
}
