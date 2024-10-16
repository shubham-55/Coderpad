package gs.coderpad.strings;

public class CountLength {
    public static void main(String[] args) {
        String s="moushmi";
        countLength(s);
    }
    public static void countLength(String s) {
        int i=0;
        for(char c:s.toCharArray()) i++;
        System.out.print(i);
    }
}
