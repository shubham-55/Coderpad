package gs.coderpad.arrays;

public class PascalTriangle {
    public static void main(String args[]){
        int num=5;
        int num1=2;
        int num2=2;
        getPascal(num,num1,num2);
    }
    public static void getPascal(int num,int num1, int num2){
        int [][] arr= new int[num][num];
        for(int i =0;i<num;i++){
            arr[i][0]=1;
            arr[i][i]=1;
            for(int j=1;j<i;j++){
                arr[i][j]=arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        printPascal(arr,num);
        System.out.println();
        printCoordinate(num1,num2,arr);;
    }
    public static void printPascal(int[][] arr,int num){

        for(int i =0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void printCoordinate(int num1,int num2,int [][] pascal){
        System.out.println(pascal[num1][num2]);
    }
}
