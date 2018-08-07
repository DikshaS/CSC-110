/*
* For assignments: 6 ; Diksha Sharma
* Program Name: Assignment 6
* Sound Mixer 
* Program Input: using sound file to output the result 
*Outputs: Arrays 
*/

import java.util.*;
public class Assignment6{

    public static void main(String[]args){

	double [] sound1 ={-1,-.9,.8,-.7,-.6,.5, -.4, -.3, .2, -.1, .1, .2, -.3, .4, .5, -.6, .7, -.8, .9, 1};
	double [] sound2 ={-.3, .98, -.96, .78, .17, -.72, .25, .65, -.19, .11, -.26, .10, .30, .23, -.5, .59, -.42, .34, .84 };
	Scanner input= new Scanner();

		System.out.println("Would you like to increase the volume ? ");
		String tmp=input.next();
		if(tmp.equals("yes")){
		System.out.println("Please state whether you would like to adjust the volume for sound1 or sound2" );
		String A = input.next();
		System.out.println("Please enter the startIndex for the volume to be adjusted: ");
		int B = input.nextInt();
		System.out.println("Please enter the endIndex for the volume to be adjusted: ");
		int C = input.nextInt();
		System.out.println("Please enter the factor by which you want the volume to be adjusted: ");
		double D = input.nextDouble();
		System.out.println(" The values before adjusting the volume: " + Arrays.toString(A));
		adjustVolume(A,B,C,D);
}

		System.out.println("Would you like to mix the two sounds together? ");
		String E= input.next();
		if(E.equals("yes")){
		add(sound1,sound2);
}
		System.out.println("Would you like to reverse the sound ? ");
		String F= input.next();
		if(F.equals("yes")){
		System.out.println("Please state whether you would like to reverse sound1 or sound2?" );
		String G = input.next();
		reverse(G);
		}
		System.out.println("Would you like to replace a segment of one sound with a segment of another? ");
		String H= input.next();
		if(H.equals("yes")){
		System.out.println("Would like to take a segment from sound1 or sound2? " );
		String I = input.next();
		System.out.println("Please enter the start Index for the segment of the sound: ");
		int J = input.nextInt();
		System.out.println("Please enter the endIndex for the segment of the sound: ");
		int K = input.nextInt();
		System.out.println("Would like to place the segment into sound1 or sound2? " );
		String L = input.next();
		System.out.println("Please enter the start Index for the location to insert the segment of the sound: ");
		int M = input.nextInt();
		splice(I,J,K,L,M);
}
		System.out.println("Would you like to adjust the frequency of the sound ? ");
		String N=input.next();
		if(N.equals("yes")){
		System.out.println("Please state whether you would like to adjust the frequency for sound1 or sound2" );
		String O= input.next();
		System.out.println("Please enter the factor by which you want the frequency to be adjusted: ");
		double P = input.nextDouble();
		double [] Q= adjustFrequency(O,P);
		System.out.println(" The values after adjusting the frequency: " + Arrays.toString(Q));
}


}

	    public static void adjustVolume(double[] samples, int startIndex, int endIndex, double factor){
		if(endIndex<samples.length){
		    for(int i=startIndex; i<= endIndex; i++){
			if(factor > 0){
			    samples[i]=samples[i]*factor;
			    //if the factor is >1 then the volume increses, and if the factor is <1 then the volume decreses
			}
		    }
		    System.out.println(" The values after adjusting the volume: " + Arrays.toString(samples));
		}else{
		    //System.out.println(figure out a way);
		}
	    }

	    public static void add(double [] samples1, double[] samples2){
		if( samples1.length > samples2.length){
		    for(int i=0; i<sample2.length; i++){
			samples1 [i] = samples1[i] +samples2[i];
			if(samples1[i]>1){
	adjustVolume(samples1,i,i,0.5);
	}
		    }
		    System.out.println(Array.toString(samples1));

		}else if(samples2.length>samples1.length){
		    for(int i=0; i<samples1.length; i++){
			samples2 [i] = samples2[i] +samples1[i];
			if(samples2[i]>1){
	adjustVolume(samples2,i,i,0.5);
	}
		    }
		    System.out.println(Arrays.toString(samples2));
		}
	    }

	    public static void reverse (double [] samples){

		double [] temp = new double [samples.length];
	for (int i=0; i < samples.length; i++){
	temp[i] = samples[samples.length - (i+1)];
	}
	System.out.println(Arrays.toString(temp));
	    }


	public static void splice (double [] source, int sourceStart, int sourceStop, double [] destination, int destStart){
		int j=destStart;
		if(sourcestop==(source.length-1)){
		if((destination.length-1)==sourceStop){
	for( int i =sourceStart; i>=sourceStop; i++){
		source [i] = destination [j];
		j++;
	}
	}
	System.out.println(" The values after adjusting the sound: " + Arrays.toString(source));
		}else{
	//find a solution
	}
	}
	public static double [] adjustFrequency (double [] samples, double factor){
	//if factor>1, the frequency will increase and the volume will decrease, whereas if 0<factor<1 then frequency will decrease and volume will increase
	double [] newSamples = new double [(int)(samples.length/factor)];
	double samplesIndex=0;
	for(int i=0; i<newSamples.length; i++){
	newSamples[i]=samples[(int)samplesIndex];
	samplesIndex=samplesIndex+factor;
	}
	return newSamples;
	}

	}


	On Saturday, 19 July 2014, 17:01, Diksha Sharma <diksha1995@hotmail.com> wrote:


	public class Assignment6{

	    public static void main(String[]args){

	     double [] sound1 ={-1,-.9,.8,-.7,-.6,.5, -.4, -.3, .2, -.1, .1, .2, -.3, .4, .5, -.6, .7, -.8, .9, 1};
	     double [] sound2 ={-.3, .98, -.96, .78, .17, -.72, .25, .65, -.19, .11, -.26, .10, .30, .23, -.5, .59, -.42, .34, .84 };
	     System.out.println(Array.toString(sound1));
	     adjustVolume(sound1, 2,454,2);
	     System.out.println(Array.toString(sound1));
	    }

	    public static void adjustVolume(double[] samples, int startIndex, int endIndex, double factor){
		if(endIndex<samples.length){
		    for(int i=startIndex; i<= endIndex; i++){
			if(factor > 0){
			    samples[i]=samples[i]*factor;
			    //if the factor is >1 then the volume increses, and if the factor is <1 then the volume decreses
			}
		    }
		}else{
		    //System.out.println(figure out a way);
		}

	    }

	    public static void add(double [] samples1, double[] samples2){
		if( samples1.length > samples2.length){
		    for(int i=0; i<sample2.length; i++){
			samples1 [i] = samples1[i] +samples2[i];
		    }
		}else (samples2.length>samples1.length){
		    for(int i=0; i<samples1.length; i++){
			samples2 [i] = samples2[i] +samples1[i];
		    }
		}
	    }

	    public static void reserve (double [] samples){

		double [] temp = new double [samples.length];
		    for (int i=0; i < samples.length; i++){
			temp[i] = samples[samples.length - (i+1)];
		    }
		    System.out.println("Printing values: " + array.toString(temp));
	    }

	/*

	    public static void splice (double [] source, int sourceStart, int sourceStop, double [] destination, int destStart){
		int j=0;
		int tmp= new [sample.length];
		for( int i =samples.length -1; i>=0; i--){
		    source [i] = destination [j];
		    j++;
		}
		public static double [] adjustFrequency (double [] samples, double factor){


    }

    }*/





}