package com.shi;

public class VowelAndConsonant {
	
	void checkLetter(char x) {
		
		String letter = "aeiouAEIOUbcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
		
		boolean flag =true;
		
		 for(int i=0; i<letter.length(); i++) {
			 
			 if(i>=0 && i<10 && letter.charAt(i) == x) {
				 
				System.out.println("Character is Vowel");
				
				flag = false;
				
				break;
				
			 }
			 
			 else if(i>=10 && letter.charAt(i) == x) {
				 
				 System.out.println("Character is Consonant");
				 
				 flag=false;
				 
				 break; 
				 
			 }
			 
		 }
		 
		 if(flag)	 System.out.println("Invalid Character");
		 
	}
	
	public static void main(String[] args) {
		
		VowelAndConsonant s1 =new VowelAndConsonant();
		
		s1.checkLetter('u');
		s1.checkLetter('V');
		s1.checkLetter('8');

	}

}
