package gs.coderpad.lastDay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageScore {
    public static void main(String[] args) {
        String[][] reportCard={{"Rohit", "85"},{"Rahul", "80"},{"Amit","85"},{"Rohit", "90"}};
        findMaxAverage(reportCard);
    }
    public static void findMaxAverage(String[][] reportCard){
        Map<String, List<Integer>> scores= new HashMap<>();
        for(String[] s: reportCard){
            String name=s[0];
            int score=Integer.parseInt(s[1]);
            scores.putIfAbsent(name,new ArrayList<>());
            List<Integer> gradeList= scores.get(name);
            gradeList.add(score);
        }
        double maxAverage = 0;
        for(List<Integer> l: scores.values()){
            int sum=0;
            for(int score:l){
                sum +=score;
            }
            maxAverage= Math.max(maxAverage,(sum/l.size()));
        }
        System.out.println((int)Math.floor(maxAverage));
    }
}
