/*
* For assignments:2; Diksha Sharma
* Program Name: Dollar figure
* Create a dollar figure using "*" and "$"
* Program Input: use nested for loops to create a dollar figure 
*Outputs: Dollar Figure structure
*/
public class DollarFigure{
	public static void main(String [] args){
	int dollar;
	int starCount;
	int sidestar;
	
	for(dollar =7;  dollar >0; dollar--){
		starCount= 2* dollar;
		sidestar = 14 -starCount;
		
		for(int i=0; i< sidestar; i++)
			System.out.print("*");
			for(int j=0; j<dollar; j++)
				System.out.print("$");
				for(int k=0; k<starCount; k++)
					System.out.print("*");
				for(int l=0; l<dollar; l++)
					System.out.print("$");
				for(int m=0; m<sidestar; m++)
					System.out.print("*");
				System.out.println();
}	
	
}
}
    
    
    
 /*  for (int i = 1; i <= 7; i++) {
		for (int j = 0; j <=(i+1) ; j++) {
			System.out.print("*");
		}
			for (int k=7; k>=i; k--){
				System.out.print("$");
		}
		for (int j = 1; j <= 16 - 2 * i; j++) {
			System.out.print("*");
		}
			for (int k=7; k>=i; k--){
				System.out.print("$");
		}
		for (int j = 1; j <= (i+1); j++) {
			System.out.print("*");
				}
	System.out.println();	
	}
	*/
