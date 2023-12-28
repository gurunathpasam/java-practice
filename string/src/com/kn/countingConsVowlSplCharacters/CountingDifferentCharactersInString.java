package com.kn.countingConsVowlSplCharacters;

public class CountingDifferentCharactersInString {
	//method description to find the number of consonants in string
		public static int countConsonants(String inputString)
		{
			char[]crr=inputString.toCharArray();
			int k=0,consonantsCount=0;
			for(int i=0;i<crr.length;i++)
			{
				k=crr[i];
				if(k>=65&&k<=90&&k!=65&&k!=69&&k!=73&&k!=79&&k!=85)
				{
					consonantsCount++;
				}
			}
			return consonantsCount;
		}
		//method description to find the number of vowels in string
		public static int countVowels(String inputString)
		{
			char[]crr=inputString.toCharArray();
			int k=0,vowelsCount=0;
			for(int i=0;i<crr.length;i++)
			{
				k=crr[i];
				if(k>=65&&k<=90&&(k==65||k==69||k==73||k==79||k==85))
				{
					vowelsCount++;
				}
			}
			return vowelsCount;
		}
		//method description to find the number of special characters in string
		public static int specialCharactersCount(String inputString)
		{
			char[]crr=inputString.toCharArray();
			int k=0,splCharCount=0;
			for(int i=0;i<crr.length;i++)
			{
				k=crr[i];
		        if((k>=65&&k<90)||(k>=48&&k<=57))
				{
		        	
				}
		        else
		        {
		        	splCharCount++;
		        }
			}
			return splCharCount;
		}
		//method description to find the number of numeric values in string
		public static int neumericCount(String inputString)
		{
			char[]crr=inputString.toCharArray();
			int k=0,neumericCount=0;
			for(int i=0;i<crr.length;i++)
			{
				k=crr[i];
		        if(k>=48&&k<=57)
				{
		        	neumericCount++;
				}
			}
			return neumericCount;
		}
		

}



