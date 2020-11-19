package randomNumbers;

import java.util.LinkedHashSet;
import java.util.Random;

public class RandomNumberGen {

	public static void main(String[] args) throws NullPointerException{
		  LinkedHashSet<Integer>randomvalues=new LinkedHashSet<Integer>();
		  
		//for(int i=0;i<500;i++) {
			//System.out.println(getRadomNumberInRange(100,999));
		randomvalues.add(getRandomNumberInRange(100,999));
		while(randomvalues.size()!=500) {	
			randomvalues.add(getRandomNumberInRange(100,999));
			
		}

		System.out.println(randomvalues);
		System.out.println(randomvalues.size());
		
		}
			public static int getRandomNumberInRange(int min,int max) {
				if(min>max) {
					throw new IllegalArgumentException("max must be greater than min");
					
				}
				Random r=new Random();
				return r.nextInt((max-min)+1)+min;
				

			}
			
	}


