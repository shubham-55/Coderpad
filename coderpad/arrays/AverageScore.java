import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class AverageScore {
    public static void main(String[] args) {
        String[][] grades = {
                {"Rohit", "85"},
                {"Rahul", "80"},
                {"Amit", "85"},
                {"Rohit", "90"}
        };

        System.out.println(maximumAverageGrade(grades));  // Output: 87
    }

    public static int maximumAverageGrade(String[][] grades) {
        HashMap<String, List<Integer>> studentGrades = new HashMap<>();
        for (String[] entry : grades) {
            String name = entry[0];
            int grade = Integer.parseInt(entry[1]);
            studentGrades.putIfAbsent(name, new ArrayList<>());
            List<Integer> gradesList = studentGrades.get(name);
            gradesList.add(grade);
        }
        double maxAverage = Double.NEGATIVE_INFINITY;

        for (List<Integer> gradesList : studentGrades.values()) {
            int total = 0;
            for (int grade : gradesList) {
                total += grade;
            }
            double average = (double) total / gradesList.size();
            maxAverage = Math.max(maxAverage, average);
        }

        return (int) Math.floor(maxAverage);
    }
}
