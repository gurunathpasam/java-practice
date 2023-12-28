package com.kn.anagramString;

import java.util.Arrays;

public class Anagram {

	public boolean isAnagram(String s1, String s2) {
		boolean isAnagram=false;
		if(s1.length()== s2.length()) {

			char[] crr1= s1.toCharArray();
			char[] crr2= s2.toCharArray();
			crr1= sortCharacterArray(crr1);
			crr2= sortCharacterArray(crr2);
			if(Arrays.equals(crr1, crr2)){
				return true;

			}

		}
		return isAnagram;
	}
	private char[] sortCharacterArray(char[] crr) {
		for(int i=0;i<crr.length-1;i++) {
			for(int j=0;j<crr.length-1-i;j++) {
				if(crr[j]>crr[j+1]) {
					char temp=crr[j];
					crr[j]=crr[j+1];
					crr[j+1]=temp;
				}
			}
		}
		return crr;
	}

}
