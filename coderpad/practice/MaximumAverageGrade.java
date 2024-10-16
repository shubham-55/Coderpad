package gs.coderpad.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumAverageGrade {
    public static void main(String[] args) {
        String[][] arr={
                {"Rohit", "85"},
                {"Rahul", "80"},
                {"Amit", "85"},
                {"Rohit", "90"}
        };
        System.out.println(calculateAverage(arr));
    }
    public static int calculateAverage(String [][] arr){
        Map<String, List<Integer>> map= new HashMap<>();
        for(String[] str: arr){
            String name=str[0];
            int score= Integer.parseInt(str[1]);
            map.putIfAbsent(name,new ArrayList<>());
            List<Integer> scoreList= map.get(name);
            scoreList.add(score);
        }
        double maxAverage=0;
        for(List<Integer> l: map.values()){
            int sum=0;
            for(int score: l){
                sum +=score;
            }
            double average=(double)sum/l.size();
            maxAverage=Math.max(maxAverage,average);
        }
        return (int)Math.floor(maxAverage);
    }
}
