/*
* For assignments: 3; Diksha Sharma
* Program Name: Assignment 3
* Creating different methods for different outputs
* Program Input: creating new methods for each set of question and calling it from main
*Outputs: Different sets of numbers from each method
*/
public class Assignment3{
    public static void main(String [] args){

       printNumbers(10);
       printPowerof2(9);
       printPowerOfN(-3,7);


    }
  public static void printNumbers(int d){
    for(int i=1; i<=d ;i++){
          System.out.print(" [ " + i +" ] ");
    }
    System.out.println();
    }



    public static void printPowerof2(int x){
      for (int i=0; i<=x; i++){
         System.out.print(" " + (int)Math.pow(2,i) + " ");
     }
     System.out.println();
}

    public static void printPowerOfN(int m, int n){
        for(int i=0; i<=n; i++){
            System.out.print(" " + (int)Math.pow(m,i)+ " ");
        }
       System.out.println();
    }
}



