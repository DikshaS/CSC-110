/*
* For assignments:1 part2 ; Diksha Sharma
* Program Name: Approximate Pi
* Approximated the value of Pi
* Program Input: initialize a value to different variable to calculate Pi 
*Outputs: the approximated value of Pi
*/

public class Pi{
   public static void main(String[]args){
        double nextTerm= 1;
        double denominator = 1;
        double series = 0;
  
        series = (nextTerm/denominator) +series;
        denominator = denominator +2;
        nextTerm = nextTerm *(-1);
          
        series = (nextTerm/denominator) +series;
        denominator = denominator +2;
        nextTerm = nextTerm *(-1);
       
        series = (nextTerm/denominator) +series;
        denominator = denominator +2;
        nextTerm = nextTerm *(-1);
       
        series = (nextTerm/denominator) +series;
        denominator = denominator +2;
        nextTerm = nextTerm *(-1);
       
        series = (nextTerm/denominator) +series;
        denominator = denominator +2;
        nextTerm = nextTerm *(-1);
       
        series = (nextTerm/denominator) +series;
        denominator = denominator +2;
        nextTerm = nextTerm *(-1);
       
        series = (nextTerm/denominator) +series;
        denominator = denominator +2;
        nextTerm = nextTerm *(-1);
       
        series = (nextTerm/denominator) +series;
        denominator = denominator +2;
        nextTerm = nextTerm *(-1);
        System.out.println("Pi is approximately: " + (series *4));
       
      
    }
}
