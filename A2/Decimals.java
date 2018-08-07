/*
* For assignments:2  Diksha Sharma
* Program Name: Decimal values
* Get all decimal numbers between 1.0 to 2.0 in 0.1
* Program Input: create 1 variable to get all decimal values from 1.0 to 2.0
*Outputs: decimal values between 1.0 to 2.0
*/

public class Decimals{
    public static void main(String[]args){

        for (double  i = 1.0; i<2.1; i= i+0.1){
            System.out.printf("%.1f",i);
            System.out.println();
        }

    }
}
