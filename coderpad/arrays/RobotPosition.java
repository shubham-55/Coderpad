package gs.coderpad.arrays;

public class RobotPosition {
    public static void main(String[] args) {
        String str="RRULDDDLR";
        findRobotPosition(str);
    }

    public static void findRobotPosition(String str) {
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='R'){
                x++;
            }else if(str.charAt(i)=='L'){
                x--;
            }else if(str.charAt(i)=='U'){
                y++;
            }else if(str.charAt(i)=='D'){
                y--;
            }
        }
        System.out.println(x+","+y);
    }
}
