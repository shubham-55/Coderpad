package gs.coderpad.lastDay;

import java.util.ArrayList;
import java.util.List;

public class MagicalStairs {
    public static void main(String[] args) {
        int n=5;
        findways(n,0,1,new ArrayList<>());
    }
    public static void findways(int n, int currentStep,int currentJump,List<Integer> path){
        if(currentStep==n){
            System.out.println(path);
        }
        if(currentStep>n){
            System.out.println("No Valid path");
        }
        if(currentStep==0){
            List<Integer> path1= new ArrayList<>(path);
            path1.add(1);
            findways(n,currentStep+1,1,path1);

            List<Integer> path2= new ArrayList<>(path);
            path2.add(2);
            findways(n,currentStep+2,2,path2);
        }else{
            for(int i = currentJump;i<=n-currentStep;i++){
                List<Integer> path3= new ArrayList<>(path);
                path3.add(1);
                findways(n,i+1,i,path3);
            }
        }
    }
}