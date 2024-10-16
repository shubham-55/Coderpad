package gs.coderpad.practice;

public class MirrorNumber {
    public static void main(String[] args) {
        int x=32;
        int y=231;
        System.out.println(isMirrorNumber(x,y));
        findMirrorNumber(x);
    }
    public static boolean isMirrorNumber(int x,int y){
        if(String.valueOf(x).length() != String.valueOf(y).length()){
            return false;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        return sb.reverse().toString().equals(String.valueOf(y));
    }
    public static void findMirrorNumber(int x){
        int i = x%10 ;
    }
}
