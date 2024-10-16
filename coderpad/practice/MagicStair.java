package gs.coderpad.practice;

import java.util.ArrayList;
import java.util.List;

public class MagicStair {
    public static void main(String[] args) {
        int n=5;
        findAllPossiblePath(n,0,1,new ArrayList<>());
    }
    public static void findAllPossiblePath(int n, int currentStep, int lastJump, List<Integer> path){
        //Base case
        if(currentStep==n){
            System.out.println(path);
        }
        if(currentStep>n){
            System.out.println("No Valid Path");
        }
        if(currentStep==0){
            List<Integer> path1 = new ArrayList<>(path);
            path1.add(1);
            findAllPossiblePath(n,currentStep+1,1,path1);

            List<Integer> path2 = new ArrayList<>(path);
            path2.add(2);
            findAllPossiblePath(n,currentStep+2,2,path2);
        } else {
            for(int i=lastJump;i<=n-currentStep;i++){
                List<Integer> newPath= new ArrayList<>(path);
                newPath.add(i);
                findAllPossiblePath(n,currentStep+i,i,newPath);
            }
        }
    }
}
