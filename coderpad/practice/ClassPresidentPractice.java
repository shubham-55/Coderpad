package gs.coderpad.practice;

public class ClassPresidentPractice {
    public static void main(String[] args) {
        int[][] testCases = {
                {1, 1, 1},
                {2, 2, 1},
                {5, 3, 4},
                {4, 2, 1},
                {100, 2, 73},
                {6, 4, 5},
                {1000, 5, 763}
        };
        for (int[] testCase : testCases){
            System.out.println(findPresident(testCase[0],testCase[1]));
        }
    }
    public static int findPresident(int j,int k){
        int position=0;
        for(int i=1;i<=j;i++){
            position=(position+k) %i;
        }
        return position+1;
    }
}