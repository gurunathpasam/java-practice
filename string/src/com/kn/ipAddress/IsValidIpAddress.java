package com.kn.ipAddress;

public class IsValidIpAddress {

	public boolean isValid(String inputstring) {
		String[] srr=inputstring.split(".");
		boolean isValid=false;
		if(srr.length==4) {
			int count=0;
			for(int i=0;i<srr.length;i++) {
				char[] crr=srr[i].toCharArray();
				int digit=0;
				for(int j=crr.length-1;j>=0;j--) {
					digit=(digit*10)+crr[j];
					
				}
				if(digit>0 && digit<=255) {
					count++;
					
				}
				else {
					break;
				}
				if(count==srr.length) {
					isValid=true;
				}
			}
		}
		return isValid;
		
	}

}
