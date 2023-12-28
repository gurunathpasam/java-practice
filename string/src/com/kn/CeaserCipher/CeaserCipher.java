package com.kn.CeaserCipher;

public class CeaserCipher {

	public char[] isCipher(String input, int n) {
//		Convert String to CharArray
		char[] crr= input.toCharArray();
	
		 for(int i=0;i<crr.length;i++) {
			 crr[i]=(char)(crr[i]+n);
			 
		 }
		 return crr;
 		
	}

}
//for(int i=0;i<crr.length;i++) {
//	if(crr[i]>=65 && crr[i]<=90) {
//		if(crr[i]+n<=90) {
//			 crr[i]=(char)(crr[i]+n);
//		}
//		else {
//			 crr[i]=(char)(crr[i]-26+n);
//
//		}
//	}
//	 
//}
