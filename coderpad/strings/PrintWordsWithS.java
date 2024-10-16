package gs.coderpad.strings;

public class PrintWordsWithS {
    public static void main(String[] args) {
        String[] strArr={"sample","apple","sun","moon","star","galaxy"};
        printWordsWithS(strArr);
    }

    public static void printWordsWithS(String[] strArr) {
        for(String str:strArr){
            if(str.charAt(0)=='s'||str.charAt(0)=='S'){
                System.out.println(str);
            }
        }
    }
}
