package gs.coderpad.strings;

public class RunningLetters {
    public static void main(String args[]){
        String str="aaabbaa";
        printRunningLetter(str);
    }
    public static void printRunningLetter(String str){

      for(int i=0;i<str.length();i++){
          int count=1;
          for(int j=i+1;j<str.length();j++){
              if(str.charAt(i)==str.charAt(j)) {
                  count++;
                  i++;
              }else{
                  break;
              }
          }
          System.out.print(str.charAt(i)+"" +count);
      }
    }
}
